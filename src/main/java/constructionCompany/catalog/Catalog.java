package constructionCompany.catalog;

import constructionCompany.divisions.brigade.catalog.BrigadeCatalog;
import constructionCompany.divisions.department.catalog.Department;
import constructionCompany.divisions.department.catalog.catalog.DepartmentCatalog;
import constructionCompany.people.architect.Architect;
import constructionCompany.people.architect.catalog.ArchitectCatalog;
import constructionCompany.people.employees.Employee;
import constructionCompany.people.employees.catalog.EmployeeCatalog;
import constructionCompany.reserves.material.Material;
import constructionCompany.reserves.material.catalog.MaterialCatalog;
import constructionCompany.reserves.technique.Technique;
import constructionCompany.reserves.technique.catalog.TechniqueCatalog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Catalog {
    private static final Logger LOGGER = LogManager.getLogger(Catalog.class);
    public static void filling(){
        addDepartment();
        addArchitect();
        addEmployee();
        addCustomer();
        addBathhouseProject();
        addHouseProject();
        addHighriseBuildingProject();
        addMaterial();
        addTechnique();
        addBrigade();
        addBrigadeEstimates();
        addTechniqueEstimates();
        addMaterialEstimates();
        addEstimates();
    }

    private static void addMaterialEstimates() {
        /**
        MaterialEstimate materialEstimate1 = new MaterialEstimate(material1, 1, 45.9);
        MaterialEstimate materialEstimate2 = new MaterialEstimate(material2, 2, 67.1);
        MaterialEstimate materialEstimate3 = new MaterialEstimate(material3, 3, 95.4);
        MaterialEstimate materialEstimate4 = new MaterialEstimate(material4, 4, 15.9);
        MaterialEstimate materialEstimate5 = new MaterialEstimate(material5, 5, 35.7);
        MaterialEstimate materialEstimate6 = new MaterialEstimate(material6, 6, 5.9);
        MaterialEstimate materialEstimate7 = new MaterialEstimate(material7, 7, 85.3);
        MaterialEstimate materialEstimate8 = new MaterialEstimate(material8, 8, 45.9);
        MaterialEstimate materialEstimate9 = new MaterialEstimate(material9, 9, 47.4);
         */
    }

    private static void addEstimates() {
        /**
         Estimate estimate1 = new Estimate(1, (List<BrigadeEstimate>) brigadeEstimateMap1,
         (List<MaterialEstimate>) materialEstimateMap1);
         Estimate estimate2 = new Estimate(2, (List<BrigadeEstimate>) brigadeEstimateMap2,
         (List<MaterialEstimate>) materialEstimateMap2);
         Estimate estimate3 = new Estimate(3, (List<BrigadeEstimate>) brigadeEstimateMap1,
         (List<MaterialEstimate>) materialEstimateMap2);
         Estimate estimate4 = new Estimate(2, (List<BrigadeEstimate>) brigadeEstimateMap2,
         (List<MaterialEstimate>) materialEstimateMap1);
         */
    }

    private static void addTechniqueEstimates() {
    }

    private static void addBrigadeEstimates() {
        /**
        BrigadeEstimate brigadeEstimate1 = new BrigadeEstimate(brigade1, 1, 47);
        BrigadeEstimate brigadeEstimate2 = new BrigadeEstimate(brigade2, 2, 34);
        BrigadeEstimate brigadeEstimate3 = new BrigadeEstimate(brigade1, 3, 30);
        BrigadeEstimate brigadeEstimate4 = new BrigadeEstimate(brigade2, 4, 29);
        BrigadeEstimate brigadeEstimate5 = new BrigadeEstimate(brigade1, 5, 87);
         */
    }

    private static void addDepartment() {
        DepartmentCatalog departmentCatalog = DepartmentCatalog.getDepartmentCatalog();

        Department department1 = new Department("Architect", "+380993332211");
        Department department2 = new Department("Design", "+380993332212");
        Department department3 = new Department("Construction", "+380993332213");
        Department department4 = new Department("Technical", "+380993332214");

        departmentCatalog.addDepartment(department1);departmentCatalog.addDepartment(department2);
        departmentCatalog.addDepartment(department3);departmentCatalog.addDepartment(department4);
    }

    private static void addArchitect() {
        ArchitectCatalog architectCatalog = ArchitectCatalog.getArchitectCatalog();

        Department department1 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Architect");

        Architect architect1 = new Architect("Katerina", "Grizchenko", "+380503458961",
                "", 40,  61000.0, department1, 9);
        Architect architect2 = new Architect("Valeria", "Grizchenko", "+380503458962",
                "", 43,  61000.0, department1, 12);

        architectCatalog.addArchitect(architect1);
        architectCatalog.addArchitect(architect2);
    }
    private static void addEmployee() {
        EmployeeCatalog employeeCatalog = EmployeeCatalog.getEmployeeCatalog();

        Department department2 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Design");
        Department department3 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Construction");
        Department department4 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Technical");

        Employee employee1 = new Employee("Ivan", "Ivanenko", "+380503458971",
                "Designer", 56,  45000.0, department2);
        Employee employee2 = new Employee("Maria", "Ivanenko", "+380503458972",
                "Designer", 40, 45000.0, department2);
        Employee employee3 = new Employee("Diana", "Petrenko", "+380503458973",
                "Designer", 44, 48000.0, department2);
        Employee employee4 = new Employee("Dmitro", "Ignatenko", "+380503458974",
                "Constructor", 43, 48000.0, department3);
        Employee employee5 = new Employee("Valeria", "Vasylenko", "+380503458975",
                "Constructor", 68, 40000.0, department3);
        Employee employee6 = new Employee("Petro", "Mikulenko", "+380503458976",
                "Technician", 38, 41000.0, department4);
        Employee employee7 = new Employee("Roman", "Miroshnichenko", "+380503458977",
                "Technician", 39, 41000.0, department4);

        employeeCatalog.addEmployee((Employee)
                ArchitectCatalog.getArchitectCatalog().findArchitectByFullName("Katerina", "Grizchenko"));
        employeeCatalog.addEmployee((Employee)
                ArchitectCatalog.getArchitectCatalog().findArchitectByFullName("Valeria", "Grizchenko"));

        employeeCatalog.addEmployee(employee1);employeeCatalog.addEmployee(employee2);
        employeeCatalog.addEmployee(employee3);employeeCatalog.addEmployee(employee4);
        employeeCatalog.addEmployee(employee5);employeeCatalog.addEmployee(employee6);
        employeeCatalog.addEmployee(employee7);

    }

    private static void addCustomer() {
    }

    private static void addHighriseBuildingProject() {
        /**\
         HighriseBuilding highriseBuilding1 = new HighriseBuilding(1, 1000.0, 20.0,
         50.0, "", 140000.0, 6,"commerce");
         HighriseBuilding highriseBuilding2 = new HighriseBuilding(2, 3000.0, 30.0,
         100.0, "", 14000.9, 10,"Private");
         */
    }

    private static void addBathhouseProject() {
        /**
         BathhouseProject bathhouseProject1 = new BathhouseProject(1, 40.0, 5.0,
         8.0, "", 14000.9, "Finnish");
         BathhouseProject bathhouseProject2 = new BathhouseProject(2, 30.0, 5.0,
         6.0, "", 12000.5, "Roman");
         BathhouseProject bathhouseProject3 = new BathhouseProject(3, 40.0, 5.0,
         8.0, "", 15000.0, "Finnish");
         BathhouseProject bathhouseProject4 = new BathhouseProject(4, 45.6, 9.0,
         5.08, "", 14900.0, "Roman");
         */
    }

    private static void addHouseProject() {
    }

    private static void addBrigade() {
        BrigadeCatalog brigadeCatalog = BrigadeCatalog.getDepartmentCatalog();

        TechniqueCatalog techniqueCatalog = TechniqueCatalog.getTechniqueCatalog();

        List<Employee> employeeList001 = new ArrayList<>();
        employeeList001.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Ivan", "Ivanenko"));
        employeeList001.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Maria", "Ivanenko"));
        employeeList001.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Valeria", "Vasylenko"));
        employeeList001.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Valeria", "Grizchenko"));

        //Brigade brigade1 = new Brigade("001", employeeList001, techniqueList, 5000.0);

        /**
         //4.2
         List<Employee> employeeList002 = new ArrayList<>();
         employeeList002.add(employee2); employeeList002.add(employee5); employeeList002.add(employee6);
         employeeList002.add(architect2);

         Brigade brigade2 = new Brigade("002", employeeList002, techniqueList, 7000.0);

         */
    }


    private static void addMaterial() {
        MaterialCatalog materialCatalog = MaterialCatalog.getArchitectCatalog();

        Material material1 = new Material("Brick", "001", 2000);
        Material material2 = new Material("Ceramic stones (ceramic blocks)", "001", 2400);
        Material material3 = new Material("Blocks Teplosten", "001", 2200);
        Material material4 = new Material("Foam and aerated concrete blocks", "001", 2600);
        Material material5 = new Material("Log and timber", "002", 4000);
        Material material6 = new Material("Wooden frame.", "002", 3800);
        Material material7 = new Material("Panel sip.", "003", 2300);
        Material material8 = new Material("Granite", "004", 9000);
        Material material9 = new Material("Dye", "005", 1000);

        materialCatalog.addMaterial(material1);materialCatalog.addMaterial(material2);
        materialCatalog.addMaterial(material3);materialCatalog.addMaterial(material4);
        materialCatalog.addMaterial(material5);materialCatalog.addMaterial(material6);
        materialCatalog.addMaterial(material7);materialCatalog.addMaterial(material8);
        materialCatalog.addMaterial(material9);
    }

    private static void addTechnique() {
        TechniqueCatalog techniqueCatalog = TechniqueCatalog.getTechniqueCatalog();

        Technique technique1 = new Technique("Sennebogen S 613R", "Telekran", 4000.0);
        Technique technique2 = new Technique("Sennebogen S 60 8p", "Telekran", 4000.0);
        Technique technique3 = new Technique("Hamm H 13r", "Single roller skating rink", 3300.0);
        Technique technique4 = new Technique("Takeuchi p66j8", "Excavator", 5400.0);
        Technique technique5 = new Technique("Takeuchi p66j0", "Excavator", 4500.0);

        techniqueCatalog.addTechnique(technique1);techniqueCatalog.addTechnique(technique2);
        techniqueCatalog.addTechnique(technique3);techniqueCatalog.addTechnique(technique4);
        techniqueCatalog.addTechnique(technique5);
    }
}

