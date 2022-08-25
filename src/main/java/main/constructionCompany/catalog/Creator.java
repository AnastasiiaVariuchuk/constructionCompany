package main.constructionCompany.catalog;

import main.constructionCompany.divisions.ConstructionCompany;
import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.divisions.department.catalog.catalog.DepartmentCatalog;
import main.constructionCompany.estimates.estimate.Estimate;
import main.constructionCompany.estimates.estimate.catalog.EstimatesCatalog;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.customer.catalog.CustomerCatalog;
import main.constructionCompany.projects.TypeProject;
import main.constructionCompany.projects.bathhouseProject.BathhouseProject;
import main.constructionCompany.projects.bathhouseProject.catalog.BathhouseProjectCatalog;
import main.constructionCompany.projects.highriseBuilding.HighriseBuilding;
import main.constructionCompany.projects.highriseBuilding.catalog.HighriseBuildingCatalog;
import main.constructionCompany.projects.houseProject.HouseProject;
import main.constructionCompany.projects.houseProject.catalog.HouseProjectCatalog;
import main.constructionCompany.projects.project.Project;
import main.constructionCompany.projects.project.catalog.ProjectCatalog;
import main.constructionCompany.reserves.Site;
import main.constructionCompany.reserves.material.Material;
import main.constructionCompany.reserves.material.catalog.MaterialCatalog;
import main.constructionCompany.reserves.technique.Technique;
import main.constructionCompany.reserves.technique.catalog.TechniqueCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static main.constructionCompany.catalog.Catalog.*;

public class Creator {

    public static ConstructionCompany getConstructionCompany() {
        return createTheCompany();
    }

    public static List<BathhouseProject> getBathhouseProjects() {
        addBathhouseProject();
        return BathhouseProjectCatalog.getBathhouseProjectCatalog().toList();
    }

    public static List<HighriseBuilding> getHighriseBuildings() {
        addHighriseBuildingProject();
        return HighriseBuildingCatalog.getHighriseBuildingCatalog().toList();
    }

    public static List<HouseProject> getHouseProjects() {
        addHouseProject();
        return HouseProjectCatalog.getHouseProjectCatalog().toList();
    }

    public static List<Customer> getCustomers() {
        addCustomer();
        return CustomerCatalog.getCustomerCatalog().toList();
    }

    public static List<Project> getProjects() {
        addProject();
        return ProjectCatalog.getProjectCatalog().toList();
    }

    public static List<Department> getDepartments() {
        addDepartment();
        return DepartmentCatalog.getDepartmentCatalog().toList();
    }

    public static List<Material> getMaterials() {
        addMaterial();
        return MaterialCatalog.getMaterialCatalog().toList();
    }

    public static List<Technique> getTechnique() {
        addTechnique();
        return TechniqueCatalog.getTechniqueCatalog().tiList();
    }

    public static List<Estimate> getEstimates() {
        addEstimates();
        return EstimatesCatalog.getEstimatesCatalog().toList();
    }

    /**
     *
     *int number, Customer customer,
     *                    List<Estimate> estimates, List<BuildingPlan> buildingPlans,
     *                    Site site, TypeProject typeProject,
     */
    public static Project createNewProject(Customer customer, TypeProject typeProject) {
        //for number
        int min = 4;
        int max = 10;
        int diff = max - min;
        Random random1 = new Random();
        int i = random1.nextInt(diff + 1);
        int number = i + min;

        //for estimates
        List<Estimate> estimateList = new ArrayList<>();
        int e;
        Estimate estimate = new Estimate();
        for (int j = 0; j < 2 ; j++) {
            min = 0;
            max = getEstimates().size() - 1;
            diff = max - min;
            Random random2 = new Random();
            i = random2.nextInt(diff + 1);
            e = i + min;
            estimate = getEstimates().get(e);
            estimateList.add(estimate);
        }

        Site site = new Site();

        Project project = new Project(number, customer, estimateList, site, typeProject);
        return project;
    }

}
