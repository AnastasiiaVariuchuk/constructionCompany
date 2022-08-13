package main.constructionCompany.estimates;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Estimate implements ICost {
    private int code;
    private List<BrigadeEstimate> brigadeEstimates;
    private List<MaterialEstimate> materialEstimates;
    private static final Logger logger = LogManager.getLogger(Estimate.class);

    public Estimate() {
    }

    public Estimate(int code, List<BrigadeEstimate> brigadeEstimates,
                     List<MaterialEstimate> materialEstimates) {
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.brigadeEstimates = brigadeEstimates;
        this.materialEstimates = materialEstimates;
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

    public void setBrigadeEstimates(List<BrigadeEstimate> brigadeEstimates) {
        this.brigadeEstimates = brigadeEstimates;
    }

    public List<BrigadeEstimate> getBrigadeEstimates() {
        return brigadeEstimates;
    }

    public void setMaterialEstimates(List<MaterialEstimate> materialEstimates) {
        this.materialEstimates = materialEstimates;
    }

    public List<MaterialEstimate> getMaterialEstimates() {
        return materialEstimates;
    }

    @Override
    public String toString() {
        return "Estimate [\nname => " + code
                + "\nmaterial estimate list => " + materialEstimates.toString()
                + "\nbrigade estimate list => " + brigadeEstimates.toString() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Estimate e = (Estimate) obj;
        return (code == e.code)
                && (brigadeEstimates == e.brigadeEstimates
                || (brigadeEstimates != null && brigadeEstimates.equals(e.getBrigadeEstimates())))
                && (materialEstimates == e.materialEstimates
                || (materialEstimates != null && materialEstimates.equals(e.getMaterialEstimates())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, brigadeEstimates.hashCode(), materialEstimates.hashCode());
    }

    @Override
    public double getPrice() {
        double brigadeEstimate1 = 0, materialEstimate1 = 0;
        for (BrigadeEstimate brigadeEstimate : brigadeEstimates) {
            brigadeEstimate1 += brigadeEstimate.getPrice();
        }
        for (MaterialEstimate materialEstimate : materialEstimates){
            materialEstimate1 += materialEstimate.getPrice();
        }
        return materialEstimate1 + brigadeEstimate1;
    }
}
