package main.constructionCompany.projects.houseProject;

import main.constructionCompany.projects.IOrder;
import main.constructionCompany.projects.TypeProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import java.util.Objects;
public class HouseProject extends TypeProject implements IOrder {
    private String familySize;
    private String garageType;
    private static final Logger logger = LogManager.getLogger(HouseProject.class);

    public HouseProject(){
    }

    public HouseProject(int number, double square, double recommendedSectionLength, double recommendedSectionWidth,
                        String description, double cost, String familySize, String garageType) {
        super(number,
                square,
                recommendedSectionLength,
                recommendedSectionWidth,
                description,
                cost);
        this.familySize = familySize;
        this.garageType = garageType;
    }

    public void setFamilySize(String familySize) {
        this.familySize = familySize;
    }

    public String getFamilySize() {
        return familySize;
    }

    public void setGarageType(String garageType) {
        this.garageType = garageType;
    }

    public String getGarageType() {
        return garageType;
    }

    public String toString() {
        return "\nHouse Project [\nnumber => " + super.getNumber()
                + "square => " + super.getSquare()
                + "recommended section length => " + super.getRecommendedSectionLength()
                + "recommended section width => " + super.getRecommendedSectionWidth()
                + "description => " + super.getDescription()
                + "cost => " + super.getSquare()
                + "family size => " + familySize
                + "garage type => " + garageType
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

        HouseProject h = (HouseProject) obj;
        return getNumber() == h.getNumber()
                && getSquare() == h.getSquare()
                && getRecommendedSectionLength() == h.getRecommendedSectionLength()
                && getRecommendedSectionWidth() == h.getRecommendedSectionWidth()
                && Objects.equals(getDescription(), h.getDescription())
                && getCost() == h.getCost()
                && Objects.equals(familySize, h.familySize)
                && Objects.equals(garageType, h.garageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getSquare(), getRecommendedSectionLength(), getRecommendedSectionWidth(),
                getDescription().hashCode(), getCost(), familySize, garageType.hashCode());
    }

    @Override
    public String myTypeOfProject() {
        return "It`s House Project";
    }

    @Override
    public Message getOrder() {
        logger.info("Congratulations, you have placed an order for the House Project!");
        System.out.println(this);
        return null;
    }
}
