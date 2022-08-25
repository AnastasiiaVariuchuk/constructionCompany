package main.constructionCompany.reserves.technique;

import java.util.Objects;

public class Technique {
    private String nameModel;
    private String type;
    private double rentalPrice;

    public Technique() {
    }

    public Technique(String nameModel, String type, double rentalPrice){
        this.nameModel = nameModel;
        this.type = type;
        this.rentalPrice = rentalPrice;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    @Override
    public String toString() {
        return "\nTechnique [ name of model => " + nameModel
                + " type => " + type
                + " rental price => " + rentalPrice + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Technique t = (Technique) obj;
        return Objects.equals(nameModel, t.nameModel)
                && Objects.equals(type, t.type)
                && rentalPrice == t.rentalPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameModel.hashCode(), type.hashCode(), rentalPrice);
    }
}
