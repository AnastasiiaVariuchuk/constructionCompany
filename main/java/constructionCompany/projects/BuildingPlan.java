package main.constructionCompany.projects;

import main.constructionCompany.divisions.Brigade;
import main.constructionCompany.estimates.MaterialEstimate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class BuildingPlan {
    private int planNumber;
    private Brigade brigade;
    private MaterialEstimate materialEstimate;
    private List<Date> dates;
    private static final Logger logger = LogManager.getLogger(BuildingPlan.class);

    public BuildingPlan() {
    }

    public BuildingPlan(int planNumber, Brigade brigade,
                        MaterialEstimate materialEstimate,
                        List<Date> dates) {
        if (planNumber < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.planNumber = planNumber;
        }
        this.brigade = brigade;
        this.materialEstimate = materialEstimate;
        this.dates = dates;
    }

    public String toString() {
        return "Building Plan [\nnumber => " + planNumber
                + "\nbrigade => " + brigade
                + "\nmaterial estimate => " + materialEstimate
                + "\ndates list =>" + dates + " ]";
    }

    public void setPlanNumber(int planNumber) {
        if (planNumber < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.planNumber = planNumber;
        }
    }

    public int getPlanNumber() {
        return planNumber;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setMaterialEstimate(MaterialEstimate materialEstimate) {
        this.materialEstimate = materialEstimate;
    }

    public MaterialEstimate getMaterialEstimate() {
        return materialEstimate;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<Date> getDates() {
        return dates;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        BuildingPlan b = (BuildingPlan) obj;
        return planNumber == b.planNumber
                && (brigade == b.brigade || (brigade != null && brigade.equals(b.getBrigade())))
                && (materialEstimate == b.materialEstimate
                || (materialEstimate != null && materialEstimate.equals(b.getMaterialEstimate())))
                && (dates == b.dates || (dates != null && dates.equals(b.getDates())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(planNumber, brigade.hashCode(), materialEstimate.hashCode(),
                dates.hashCode());
    }
}
