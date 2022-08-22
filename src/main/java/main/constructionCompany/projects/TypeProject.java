package main.constructionCompany.projects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

public abstract class TypeProject implements IOrder {
    private int number;
    private double square;
    private double recommendedSectionLength;
    private double recommendedSectionWidth;
    private String description;
    private double cost;

    private static final Logger logger = LogManager.getLogger(TypeProject.class);

    public TypeProject() {
    }

    public TypeProject(int number, double square, double recommendedSectionLength, double recommendedSectionWidth,
                       String description, double cost) {
        if (number < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.number = number;
        }
        if (square < 0) {
            logger.error("ParametersException: you Square less then 0");
        } else {
            this.square = square;
        }
        if (recommendedSectionLength < 0) {
            logger.error("ParametersException: you Recommended Section Length less then 0");
        } else {
            this.recommendedSectionLength = recommendedSectionLength;
        }
        if (recommendedSectionWidth < 0) {
            logger.error("ParametersException: you Recommended Section Width less then 0");
        } else {
            this.recommendedSectionWidth = recommendedSectionWidth;
        }
        this.description = description;
        this.cost = cost;
    }

    public void setNumber(int number) {
        if (number < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setSquare(double square) {
        if (square < 0) {
            logger.error("ParametersException: you Square less then 0");
        } else {
            this.square = square;
        }
    }

    public double getSquare() {
        return square;
    }

    public void setRecommendedSectionLength(double recommendedSectionLength) {
        if (recommendedSectionLength < 0) {
            logger.error("ParametersException: you Recommended Section Length less then 0");
        } else {
            this.recommendedSectionLength = recommendedSectionLength;
        }
    }

    public double getRecommendedSectionLength() {
        return recommendedSectionLength;
    }

    public void setRecommendedSectionWidth(double recommendedSectionWidth) {
        if (recommendedSectionWidth < 0) {
            logger.error("ParametersException: you Recommended Section Width less then 0");
        } else {
            this.recommendedSectionWidth = recommendedSectionWidth;
        }
    }

    public double getRecommendedSectionWidth() {
        return recommendedSectionWidth;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public abstract String myTypeOfProject();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract Message getOrder();
}
