package main.constructionCompany.reserves.material;

import main.constructionCompany.reserves.ISimilar;

import java.util.Objects;


public class Material implements ISimilar {
    public String name;
    public String type;
    public double cost;

    public Material() {
    }

    public Material(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\nMaterial [name => " + name
                + " type => " + type
                + " cost => " + cost + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Material m = (Material) obj;
        return Objects.equals(name, m.name)
                && Objects.equals(type, m.type)
                && (cost == m.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.hashCode(), type.hashCode(), cost);
    }

    @Override
    public boolean isSimilarType(Material material) {
        return Objects.equals(this.type, material.getType());
    }

    @Override
    public boolean isSimilarMaterial(Material material) {
        return Objects.equals(this.type, material.getType()) && Objects.equals(this.name, material.getName());
    }
}

