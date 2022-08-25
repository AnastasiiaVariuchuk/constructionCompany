package main.constructionCompany.estimates.brigadeEstimate;

import main.constructionCompany.divisions.brigade.Brigade;
import main.constructionCompany.estimates.ICost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class BrigadeEstimate implements ICost {
    private int code;
    private int workHours;
    private Brigade brigade;
    private static final Logger logger = LogManager.getLogger(BrigadeEstimate.class);

    public BrigadeEstimate() {
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
        return "\nBrigade Estimate [ Brigade  => " + brigade
                + " brigade estimate code => " + code
                + " brigade work hours =>" + workHours + " ]";
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
        return Objects.equals(brigade, b.brigade)
                && (code == b.code)
                && (workHours == b.workHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash( getBrigade().hashCode(), code, workHours);
    }

    @Override
    public double getPrice() {
        return getBrigade().getWorkPrice() * workHours;
    }
}
