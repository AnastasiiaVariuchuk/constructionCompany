package constructionCompany.divisions;

import constructionCompany.projects.BuildingPlan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Month;
import java.util.List;
import java.util.Objects;

public class Schedule {
    private int code;
    private Month month;
    private List<BuildingPlan> buildingPlans;
    private static final Logger logger = LogManager.getLogger(Schedule.class);

    public Schedule() {
    }

    public Schedule(int code, Month month, List<BuildingPlan> buildingPlans) {
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.month = month;
        this.buildingPlans = buildingPlans;
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

    public void setMonth(Month month) {
        this.month = month;
    }

    public Month getMonth() {
        return month;
    }

    public void setBuildingPlans(List<BuildingPlan> buildingPlans) {
        this.buildingPlans = buildingPlans;
    }

    public List<BuildingPlan> getBuildingPlans() {
        return buildingPlans;
    }

    @Override
    public String toString() {
        return "Schedule [\ncode => " + code
                + "\nmonth => " + month
                + "\nlist of building plans => " + buildingPlans.toString() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Schedule s = (Schedule) obj;
        return code == s.code
                && (month == s.month || (month != null && month.equals(s.getMonth())))
                && Objects.equals(buildingPlans, s.getBuildingPlans());
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, month.hashCode(), buildingPlans.hashCode());
    }

}
