package main.constructionCompany.catalog;

import main.constructionCompany.divisions.ConstructionCompany;
import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.divisions.department.catalog.catalog.DepartmentCatalog;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.customer.catalog.CustomerCatalog;
import main.constructionCompany.projects.bathhouseProject.BathhouseProject;
import main.constructionCompany.projects.bathhouseProject.catalog.BathhouseProjectCatalog;
import main.constructionCompany.projects.highriseBuilding.HighriseBuilding;
import main.constructionCompany.projects.highriseBuilding.catalog.HighriseBuildingCatalog;
import main.constructionCompany.projects.houseProject.HouseProject;
import main.constructionCompany.projects.houseProject.catalog.HouseProjectCatalog;
import main.constructionCompany.projects.project.Project;
import main.constructionCompany.projects.project.catalog.ProjectCatalog;
import main.constructionCompany.reserves.material.Material;
import main.constructionCompany.reserves.material.catalog.MaterialCatalog;
import main.constructionCompany.reserves.technique.Technique;
import main.constructionCompany.reserves.technique.catalog.TechniqueCatalog;

import java.util.List;

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

}
