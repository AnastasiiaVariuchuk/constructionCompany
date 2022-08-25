package main.constructionCompany.reserves;

import main.constructionCompany.estimates.materialEstimate.MaterialEstimate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Site {
    private String address;
    private int codeSite;
    private double square;
    private double length;
    private double width;
    private String description;
    private static final Logger logger = LogManager.getLogger(MaterialEstimate.class);

    public Site(){
    }

    public Site(String address, int codeSite, double square,
                double length, double width, String description) {
        this.address = address;
        if (codeSite < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.codeSite = codeSite;
        }
        if (square < 0) {
            logger.error("ParametersException: you Square less then 0");
        } else {
            this.square = square;
        }
        if (length < 0) {
            logger.error("ParametersException: you length less then 0");
        } else {
            this.length = length;
        }
        if (width < 0) {
            logger.error("ParametersException: you width less then 0");
        } else {
            this.width = width;
        }
        this.description = description;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCodeSite(int codeSite) {
        if (codeSite < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.codeSite = codeSite;
        }
    }

    public int getCodeSite() {
        return codeSite;
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

    public void setLength(double length) {
        if (length < 0) {
            logger.error("ParametersException: you length less then 0");
        } else {
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            logger.error("ParametersException: you width less then 0");
        } else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\nSite [ address => " + address
                + " code of cite => " + codeSite
                + " square => " + square
                + " length => " + length
                + " width => " + width
                + " description => " + description + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Site s = (Site) obj;
        return Objects.equals(address, s.address)
                && codeSite == s.codeSite
                && square == s.square
                && length == s.length
                && width ==s.width
                && Objects.equals(description, s.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(address.hashCode(), description.hashCode(), codeSite, square, length, width);
    }
}

