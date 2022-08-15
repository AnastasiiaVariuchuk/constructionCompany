package constructionCompany.divisions.brigade;

import constructionCompany.reserves.technique.Technique;
import constructionCompany.people.employees.Employee;

import java.util.List;
import java.util.Objects;

public class Brigade {
    private String name;
    private List<Employee> employees;
    private List<Technique> techniques;
    private double workPrice;

    public Brigade() {
    }

    public Brigade(String name, List<Employee> employees,
                   List<Technique> techniques, double workPrice) {
        this.name = name;
        this.employees = employees;
        this.techniques = techniques;
        this.workPrice = workPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setTechniques(List<Technique> techniques) {
        this.techniques = techniques;
    }

    public List<Technique> getTechniques() {
        return techniques;
    }

    public void setWorkPrice(double workPrice) {
        this.workPrice = workPrice;
    }

    public double getWorkPrice() {
        return workPrice;
    }

    @Override
    public String toString() {
        return "Brigade [\nbrigade name => " + name
                + "\nbrigade prise per hour => " + workPrice + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Brigade b = (Brigade) obj;
        return Objects.equals(name, b.name)
                && (employees == b.employees || (employees != null && employees.equals(b.getEmployees())))
                && (techniques == b.techniques || (techniques != null && techniques.equals(b.getTechniques())))
                && workPrice == b.workPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.hashCode(), employees.hashCode(), techniques.hashCode(),
                workPrice);
    }
}
