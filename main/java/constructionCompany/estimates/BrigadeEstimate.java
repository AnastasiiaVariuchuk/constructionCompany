package main.constructionCompany.estimates;

import main.constructionCompany.divisions.Brigade;
import main.constructionCompany.people.employees.Employee;
import main.constructionCompany.reserves.Technique;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class BrigadeEstimate extends Brigade implements ICost{
    private int code;
    private int workHours;
    private Brigade brigade;
    private static final Logger logger = LogManager.getLogger(BrigadeEstimate.class);

    public BrigadeEstimate() {
    }

    public BrigadeEstimate(String name, List<Employee> employees, List<Technique> techniques, double workPrice,
                           int code, int workHours) {
        super(name, employees, techniques, workPrice);
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.workHours = workHours;
    }

    public BrigadeEstimate(Brigade brigade, int code, int workHours)  {
        this.brigade = brigade;
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.workHours = workHours;
    }

    public void setCode(int code) {
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
    }

    public int getCode() {
        return code;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    @Override
    public String toString() {
        return "Brigade Estimate [\nbrigade name => " + super.getName()
                + "\nbrigade prise per hour => " + super.getWorkPrice()
                + "\nbrigade estimate code => " + code
                + "\nbrigade work hours =>" + workHours + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        BrigadeEstimate b = (BrigadeEstimate) obj;
        return Objects.equals(getName(), b.getName())
                && (getEmployees() == b.getEmployees()
                || (getEmployees() != null && getEmployees().equals(b.getEmployees())))
                && (getTechniques() == b.getTechniques()
                || (getTechniques() != null && getTechniques().equals(b.getTechniques())))
                && (getWorkPrice() == b.getWorkPrice())
                && (code == b.code)
                && (workHours == b.workHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getEmployees().hashCode(), getTechniques().hashCode(),
                getWorkPrice(), code, workHours);
    }

    @Override
    public double getPrice() {
        return getWorkPrice() * workHours;
    }
}
