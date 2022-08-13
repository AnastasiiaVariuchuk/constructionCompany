package main.constructionCompany.estimates;

import main.constructionCompany.reserves.ISimilar;
import main.constructionCompany.reserves.Material;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class MaterialEstimate extends Material implements ICost, ISimilar {
    private int code;
    private double quantity;
    private Material material;
    private static final Logger logger = LogManager.getLogger(MaterialEstimate.class);

    public MaterialEstimate() {
    }

    public MaterialEstimate(String name, String type, double cost, int code, double quantity) {
        super(name, type, cost);
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.quantity = quantity;
    }

    public MaterialEstimate(Material material, int code, double quantity) {
        this.material = material;
        if (code < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.code = code;
        }
        this.quantity = quantity;
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

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material Estimate [\nname => " + super.getName()
                + "\ntype => " + super.getType()
                + "\ncost => " + super.getCost()
                + "\ncode => " + code
                + "\nquantity => " + quantity + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MaterialEstimate m = (MaterialEstimate) obj;
        return Objects.equals(getName(), m.getName())
                && Objects.equals(getType(), m.getName())
                && getCost() == m.getCost()
                && code == m.code
                && quantity == m.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getType().hashCode(), getCost(), code, quantity);
    }

    @Override
    public double getPrice() {
        return getCost() * quantity;
    }

    @Override
    public boolean isSimilarType(Material material) {
        return Objects.equals(this.getType(), material.getType());
    }

    @Override
    public boolean isSimilarMaterial(Material material) {
        return Objects.equals(this.getType(), material.getType()) && Objects.equals(this.getName(), material.getName());
    }
}
