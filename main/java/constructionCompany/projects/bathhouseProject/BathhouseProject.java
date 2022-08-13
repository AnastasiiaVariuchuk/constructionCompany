package main.constructionCompany.projects.bathhouseProject;

import main.constructionCompany.projects.IOrder;
import main.constructionCompany.projects.TypeProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class BathhouseProject extends TypeProject implements IOrder {
    private String bathhouseType;
    private static final Logger logger = LogManager.getLogger(BathhouseProject.class);

    public BathhouseProject(int number, double square, double recommendedSectionLength, double recommendedSectionWidth,
                            String description, double cost, String bathhouseType) {
        super(number, square, recommendedSectionLength, recommendedSectionWidth, description, cost);
        this.bathhouseType = bathhouseType;
    }

    public void setBathhouseType(String bathhouseType) {
        this.bathhouseType = bathhouseType;
    }

    public String getBathhouseType() {
        return bathhouseType;
    }

    @Override
    public String toString() {
        return "Bathhouse Project [\nnumber => " + super.getNumber()
                + "\nsquare => " + super.getSquare()
                + "\nrecommended section length => " + super.getRecommendedSectionLength()
                + "\nrecommended section width => " + super.getRecommendedSectionWidth()
                + "\ndescription => " + super.getDescription()
                + "\ncost => " + super.getSquare()
                + "\nbathhouseType => " + getBathhouseType()
                + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        BathhouseProject b = (BathhouseProject) obj;
        return getNumber() == b.getNumber()
                && getSquare() == b.getSquare()
                && getRecommendedSectionLength() == b.getRecommendedSectionLength()
                && getRecommendedSectionWidth() == b.getRecommendedSectionWidth()
                && (Objects.equals(getDescription(), b.getDescription())
                || (getDescription() != null && getDescription().equals(b.getDescription())))
                && getCost() == b.getCost()
                && Objects.equals(bathhouseType, b.getBathhouseType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getSquare(), getRecommendedSectionLength(), getRecommendedSectionWidth(),
                getDescription().hashCode(), getCost(), bathhouseType.hashCode());
    }

    @Override
    public String myTypeOfProject() {
        return "It`s Bathhouse Project";
    }

    @Override
    public void getOrder() {
        logger.info("Congratulations, you have placed an order for the Bathhouse!");
        System.out.println(this);
    }
}
