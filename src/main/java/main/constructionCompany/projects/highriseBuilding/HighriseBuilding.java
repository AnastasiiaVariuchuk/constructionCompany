package main.constructionCompany.projects.highriseBuilding;

import main.constructionCompany.projects.IOrder;
import main.constructionCompany.projects.TypeProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import java.util.Objects;

public class HighriseBuilding extends TypeProject implements IOrder {
    private int high;
    private String usageType; //private, commerce, universal
    private static final Logger logger = LogManager.getLogger(HighriseBuilding.class);

    public HighriseBuilding() {
    }

    public HighriseBuilding(int number, double square, double recommendedSectionLength, double recommendedSectionWidth,
                            String description, double cost, int high, String usageType) {
        super(number, square, recommendedSectionLength, recommendedSectionWidth, description, cost);
        if (high < 0) {
            logger.error("ParametersException: you High less then 0");
        } else {
            this.high = high;
        }
        this.usageType = usageType;
    }

    public void setHigh(int high) {
        if (high < 0) {
            logger.error("ParametersException: you High less then 0");
        } else {
            this.high = high;
        }
    }

    public int getHigh() {
        return high;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getUsageType() {
        return usageType;
    }

    @Override
    public String toString() {
        return "\nHighrise Building [number => " + super.getNumber()
                + " square => " + super.getSquare()
                + " recommended section length => " + super.getRecommendedSectionLength()
                + " recommended section width => " + super.getRecommendedSectionWidth()
                + " description => " + super.getDescription()
                + " cost => " + super.getSquare()
                + " high => " + getHigh()
                + " usageType => " + getUsageType() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        HighriseBuilding h = (HighriseBuilding) obj;
        return getNumber() == h.getNumber()
                && getSquare() == h.getSquare()
                && getRecommendedSectionLength() == h.getRecommendedSectionLength()
                && getRecommendedSectionWidth() == h.getRecommendedSectionWidth()
                && Objects.equals(getDescription(), h.getDescription())
                && getCost() == h.getCost()
                && high == h.high
                && Objects.equals(usageType, h.usageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getSquare(), getRecommendedSectionLength(), getRecommendedSectionWidth(),
                getDescription().hashCode(), getCost(), high, usageType.hashCode());
    }

    @Override
    public String myTypeOfProject() {
        return "It`s Highrise Building";
    }

    @Override
    public Message getOrder() {
        logger.info("Congratulations, you have placed an order for the Highrise Building!");
        System.out.println(this);
        return null;
    }
}
