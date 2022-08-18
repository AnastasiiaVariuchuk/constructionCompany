package main.constructionCompany.projects;

import main.constructionCompany.estimates.estimate.Estimate;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.reserves.Site;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Project {
    private int number;
    private double totalCost;
    private Customer customer;
    private List<Estimate> estimates;
    private List<BuildingPlan> buildingPlans;
    private Site site;
    private TypeProject typeProject;
    private Date date;
    private static final Logger logger = LogManager.getLogger(Project.class);

    public Project() {
    }

    public Project(int number, double totalCost, Customer customer,
                   List<Estimate> estimates, List<BuildingPlan> buildingPlans,
                   Site site, TypeProject typeProject, Date date) {
        if (number < 0) {
            logger.error("Unique number exception: it less then 0");
        } else {
            this.number = number;
        }
        this.totalCost = totalCost;
        this.customer = customer;
        this.estimates = estimates;
        this.buildingPlans = buildingPlans;
        this.site = site;
        this.typeProject = typeProject;
        Date date1 = new Date(2018);
        if (date.getTime() > date1.getTime()) {
            logger.error("DateException: you project is invalid by date");
        } else {
            this.date = date;
        }
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

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setEstimates(List<Estimate> estimates) {
        this.estimates = estimates;
    }

    public List<Estimate> getEstimates() {
        return estimates;
    }

    public void setBuildingPlans(List<BuildingPlan> buildingPlans) {
        this.buildingPlans = buildingPlans;
    }

    public List<BuildingPlan> getBuildingPlans() {
        return buildingPlans;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Site getSite() {
        return site;
    }

    public void setTypeProject(TypeProject typeProject) {
        this.typeProject = typeProject;
    }

    public TypeProject getTypeProject() {
        return typeProject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date date1 = new Date(2018);
        if (date.getTime() > date1.getTime()) {
            logger.error("DateException: you project is invalid by date");
        } else {
            this.date = date;
        }
    }

    @Override
    public String toString() {
        return "Project [\nnumber => " + number
                + "\ntotal cost => " + totalCost
                + "\ncustomer => " + customer.toString()
                + "\nlist of estimates => " + estimates.toString()
                + "\nlist of building plans => " + buildingPlans.toString()
                + "\nsite => " + site.toString()
                + "\nproject type => " + typeProject.toString()
                + "\ndate of signing the contract => " + date + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Project p = (Project) obj;
        return number == p.number
                && totalCost == p.totalCost
                && Objects.equals(customer, p.customer)
                && Objects.equals(estimates, p.estimates)
                && Objects.equals(buildingPlans, p.buildingPlans)
                && Objects.equals(site, p.site)
                && Objects.equals(typeProject, p.typeProject)
                && Objects.equals(date, p.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, totalCost,customer.hashCode(), estimates.hashCode(), buildingPlans.hashCode(),
                site.hashCode(), typeProject.hashCode(), date.hashCode());
    }
}
