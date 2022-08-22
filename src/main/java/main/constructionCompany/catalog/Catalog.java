package main.constructionCompany.catalog;

import main.constructionCompany.divisions.ConstructionCompany;
import main.constructionCompany.divisions.brigade.Brigade;
import main.constructionCompany.divisions.brigade.catalog.BrigadeCatalog;
import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.divisions.department.catalog.catalog.DepartmentCatalog;
import main.constructionCompany.estimates.brigadeEstimate.BrigadeEstimate;
import main.constructionCompany.estimates.brigadeEstimate.catalog.BrigadeEstimatesCatalog;
import main.constructionCompany.estimates.estimate.Estimate;
import main.constructionCompany.estimates.estimate.catalog.EstimatesCatalog;
import main.constructionCompany.estimates.materialEstimate.MaterialEstimate;
import main.constructionCompany.estimates.materialEstimate.catalog.MaterialEstimatesCatalog;
import main.constructionCompany.people.architect.Architect;
import main.constructionCompany.people.architect.catalog.ArchitectCatalog;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.customer.catalog.CustomerCatalog;
import main.constructionCompany.people.employees.Employee;
import main.constructionCompany.people.employees.catalog.EmployeeCatalog;
import main.constructionCompany.projects.bathhouseProject.BathhouseProject;
import main.constructionCompany.projects.bathhouseProject.catalog.BathhouseProjectCatalog;
import main.constructionCompany.projects.highriseBuilding.HighriseBuilding;
import main.constructionCompany.projects.highriseBuilding.catalog.HighriseBuildingCatalog;
import main.constructionCompany.projects.project.Project;
import main.constructionCompany.projects.project.catalog.ProjectCatalog;
import main.constructionCompany.reserves.Site;
import main.constructionCompany.reserves.material.Material;
import main.constructionCompany.reserves.material.catalog.MaterialCatalog;
import main.constructionCompany.reserves.technique.Technique;
import main.constructionCompany.reserves.technique.catalog.TechniqueCatalog;
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
        addMaterialEstimates();
        addEstimates();
        addProject();
    }

    public static void addCustomer() {
        CustomerCatalog customerCatalog = CustomerCatalog.getCustomerCatalog();

        Customer customer1 = new Customer("Anastasiia", "Variuchuk", "+380995674356", 19, "12345678");
        Customer customer2 = new Customer("Ivanna", "Phenichna", "+380995674365", 39, "12345342121");
        Customer customer3 = new Customer("Valeria", "Grizchenko", "+380503458962", 43, "1234567890");

        customerCatalog.addCustomer(customer1);customerCatalog.addCustomer(customer2);
        customerCatalog.addCustomer(customer3);
    }

    public static void addProject() {
        ProjectCatalog projectCatalog = ProjectCatalog.getProjectCatalog();

        //1
        Site site1 = new Site("Kyiv", 1, 1, 1, 1, "1");
        List<Estimate> estimateList1 = new ArrayList<>();
        Estimate estimate1 =  EstimatesCatalog.getEstimatesCatalog().findEstimateByCode(1);
        Estimate estimate2 =  EstimatesCatalog.getEstimatesCatalog().findEstimateByCode(2);
        estimateList1.add(estimate1); estimateList1.add(estimate2);
        Project project1 = new Project(1, CustomerCatalog.getCustomerCatalog().findCustomerByPhoneNumber("+380995674365"),
               estimateList1,site1, HighriseBuildingCatalog.getHighriseBuildingCatalog().findHighriseBuildingByNumber(1));

        //2
        Site site2 = new Site("Kyiv", 2, 2, 2, 2, "2");
        List<Estimate> estimateList2 = new ArrayList<>();
        Estimate estimate3 =  EstimatesCatalog.getEstimatesCatalog().findEstimateByCode(3);
        Estimate estimate4 =  EstimatesCatalog.getEstimatesCatalog().findEstimateByCode(4);
        estimateList2.add(estimate3); estimateList2.add(estimate4);
        Project project2 = new Project(2, CustomerCatalog.getCustomerCatalog().findCustomerByPhoneNumber("+380995674356"),
                estimateList2, site2, BathhouseProjectCatalog.getBathhouseProjectCatalog().findBathhouseProjectByNumber(2));

        //3
        Site site3 = new Site("Kyiv", 3, 3, 3, 3, "3");
        List<Estimate> estimateList3 = new ArrayList<>();
        estimateList2.add(estimate3); estimateList2.add(estimate1);
        Project project3 = new Project(3, CustomerCatalog.getCustomerCatalog().findCustomerByPhoneNumber("+380503458962"),
                estimateList3, site3, BathhouseProjectCatalog.getBathhouseProjectCatalog().findBathhouseProjectByNumber(4));

        projectCatalog.addProject(project1);projectCatalog.addProject(project2);
        projectCatalog.addProject(project3);
    }

    public static ConstructionCompany createTheCompany() {
        ConstructionCompany constructionCompany = new ConstructionCompany(
                "Main Company", "Kyiv, Ukraine", "maincompany@gmail.com", "+280501112233",
                Creator.getDepartments(),
                Creator.getTechnique(),
                Creator.getMaterials(),
                Creator.getHouseProjects(),
                Creator.getHighriseBuildings(),
                Creator.getBathhouseProjects(),
                Creator.getProjects(),
                Creator.getCustomers());
        return constructionCompany;
    }

    public static void addMaterialEstimates() {
        MaterialEstimatesCatalog materialEstimatesCatalog = MaterialEstimatesCatalog.getMaterialEstimatesCatalog();

        MaterialEstimate materialEstimate1 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Brick"), 1, 45.9);
        MaterialEstimate materialEstimate2 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Ceramic stones (ceramic blocks)"), 2, 67.1);
        MaterialEstimate materialEstimate3 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Blocks Teplosten"), 3, 95.4);
        MaterialEstimate materialEstimate4 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Foam and aerated concrete blocks"), 4, 15.9);
        MaterialEstimate materialEstimate5 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Log and timber"), 5, 35.7);
        MaterialEstimate materialEstimate6 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Wooden frame."), 6, 5.9);
        MaterialEstimate materialEstimate7 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Panel sip."), 7, 85.3);
        MaterialEstimate materialEstimate8 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Granite"), 8, 45.9);
        MaterialEstimate materialEstimate9 = new MaterialEstimate
                (MaterialCatalog.getMaterialCatalog().findMaterialByName("Dye"), 9, 47.4);

        materialEstimatesCatalog.addMaterialEstimate(materialEstimate1);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate2);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate3);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate4);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate5);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate6);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate7);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate8);
        materialEstimatesCatalog.addMaterialEstimate(materialEstimate9);
    }

    public static void addEstimates() {
        EstimatesCatalog estimatesCatalog = EstimatesCatalog.getEstimatesCatalog();

        List<BrigadeEstimate> brigadeEstimates1= new ArrayList<>();
        brigadeEstimates1.add(BrigadeEstimatesCatalog.getMaterialEstimatesCatalog().findBrigadeEstimateByCode(1));
        brigadeEstimates1.add(BrigadeEstimatesCatalog.getMaterialEstimatesCatalog().findBrigadeEstimateByCode(3));
        brigadeEstimates1.add(BrigadeEstimatesCatalog.getMaterialEstimatesCatalog().findBrigadeEstimateByCode(5));

        List<BrigadeEstimate> brigadeEstimates2= new ArrayList<>();
        brigadeEstimates2.add(BrigadeEstimatesCatalog.getMaterialEstimatesCatalog().findBrigadeEstimateByCode(2));
        brigadeEstimates2.add(BrigadeEstimatesCatalog.getMaterialEstimatesCatalog().findBrigadeEstimateByCode(4));

        List<MaterialEstimate> materialEstimates1 = new ArrayList<>();
        materialEstimates1.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(1));
        materialEstimates1.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(3));
        materialEstimates1.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(5));
        materialEstimates1.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(7));
        materialEstimates1.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(9));

        List<MaterialEstimate> materialEstimates2 = new ArrayList<>();
        materialEstimates2.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(1));
        materialEstimates2.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(2));
        materialEstimates2.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(4));
        materialEstimates2.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(6));
        materialEstimates2.add(MaterialEstimatesCatalog.getMaterialEstimatesCatalog().findMaterialEstimateByCode(8));

        Estimate estimate1 = new Estimate(1, brigadeEstimates1, materialEstimates1);
        Estimate estimate2 = new Estimate(2, brigadeEstimates2, materialEstimates2);
        Estimate estimate3 = new Estimate(3, brigadeEstimates1, materialEstimates2);
        Estimate estimate4 = new Estimate(4, brigadeEstimates2, materialEstimates1);

        estimatesCatalog.addEstimate(estimate1);
        estimatesCatalog.addEstimate(estimate2);
        estimatesCatalog.addEstimate(estimate3);
        estimatesCatalog.addEstimate(estimate4);
    }

    public static void addBrigadeEstimates() {
        BrigadeEstimatesCatalog brigadeEstimatesCatalog = BrigadeEstimatesCatalog.getMaterialEstimatesCatalog();

        BrigadeEstimate brigadeEstimate1 = new BrigadeEstimate
                (BrigadeCatalog.getBrigadeCatalog().findBrigadeByName("001"), 1, 47);
        BrigadeEstimate brigadeEstimate2 = new BrigadeEstimate
                (BrigadeCatalog.getBrigadeCatalog().findBrigadeByName("002"),  2, 34);
        BrigadeEstimate brigadeEstimate3 = new BrigadeEstimate
                (BrigadeCatalog.getBrigadeCatalog().findBrigadeByName("001"), 3, 30);
        BrigadeEstimate brigadeEstimate4 = new BrigadeEstimate
                (BrigadeCatalog.getBrigadeCatalog().findBrigadeByName("002"), 4, 29);
        BrigadeEstimate brigadeEstimate5 = new BrigadeEstimate
                (BrigadeCatalog.getBrigadeCatalog().findBrigadeByName("001"), 5, 87);

        brigadeEstimatesCatalog.addBrigadeEstimate(brigadeEstimate1);
        brigadeEstimatesCatalog.addBrigadeEstimate(brigadeEstimate2);
        brigadeEstimatesCatalog.addBrigadeEstimate(brigadeEstimate3);
        brigadeEstimatesCatalog.addBrigadeEstimate(brigadeEstimate4);
        brigadeEstimatesCatalog.addBrigadeEstimate(brigadeEstimate5);
    }

    public static void addDepartment() {
        DepartmentCatalog departmentCatalog = DepartmentCatalog.getDepartmentCatalog();

        List<Employee> employeeList1 = EmployeeCatalog.getEmployeeCatalog().findEmployeeByPosition("Designer");
        List<Employee> employeeList2 = EmployeeCatalog.getEmployeeCatalog().findEmployeeByPosition("Constructor");
        List<Employee> employeeList3 = EmployeeCatalog.getEmployeeCatalog().findEmployeeByPosition("Technician");
        List<Employee> architectList = EmployeeCatalog.getEmployeeCatalog().findEmployeeByPosition("Architect");

        Department department1 = new Department("Architect", "+380993332211", architectList);
        Department department2 = new Department("Design", "+380993332212", employeeList1);
        Department department3 = new Department("Construction", "+380993332213", employeeList2);
        Department department4 = new Department("Technical", "+380993332214", employeeList3);

        departmentCatalog.addDepartment(department1);departmentCatalog.addDepartment(department2);
        departmentCatalog.addDepartment(department3);departmentCatalog.addDepartment(department4);
    }

    public static void addArchitect() {
        ArchitectCatalog architectCatalog = ArchitectCatalog.getArchitectCatalog();

        Department department1 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Architect");

        Architect architect1 = new Architect("Katerina", "Grizchenko", "+380503458961",
                "", 40,  61000.0, department1, 9);
        Architect architect2 = new Architect("Valeria", "Grizchenko", "+380503458962",
                "", 43,  61000.0, department1, 12);

        architectCatalog.addArchitect(architect1);
        architectCatalog.addArchitect(architect2);
    }

    public static void addEmployee() {
        EmployeeCatalog employeeCatalog = EmployeeCatalog.getEmployeeCatalog();

        Department department1 = DepartmentCatalog.getDepartmentCatalog().findDepartmentByName("Architect");
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
        Employee employee8 = new Employee("Katerina", "Grizchenko", "+380503458961",
                "Architect", 40,  61000.0, department1);
        Employee employee9 = new Employee("Valeria", "Grizchenko", "+380503458962",
                "Architect", 43,  61000.0, department1);

        //employeeCatalog.addEmployee((Employee)
        //ArchitectCatalog.getArchitectCatalog().findArchitectByFullName("Katerina", "Grizchenko"));
        //employeeCatalog.addEmployee((Employee)
        //ArchitectCatalog.getArchitectCatalog().findArchitectByFullName("Valeria", "Grizchenko"));

        employeeCatalog.addEmployee(employee1);employeeCatalog.addEmployee(employee2);
        employeeCatalog.addEmployee(employee3);employeeCatalog.addEmployee(employee4);
        employeeCatalog.addEmployee(employee5);employeeCatalog.addEmployee(employee6);
        employeeCatalog.addEmployee(employee7);employeeCatalog.addEmployee(employee8);
        employeeCatalog.addEmployee(employee9);
    }

    public static void addHighriseBuildingProject() {
        HighriseBuildingCatalog highriseBuildingCatalog = HighriseBuildingCatalog.getHighriseBuildingCatalog();

        HighriseBuilding highriseBuilding1 = new HighriseBuilding(1, 1000.0, 20.0,
                50.0, "", 140000.0, 6,"commerce");
        HighriseBuilding highriseBuilding2 = new HighriseBuilding(2, 3000.0, 30.0,
                100.0, "", 14000.9, 10,"Private");

        highriseBuildingCatalog.addHighriseBuilding(highriseBuilding1);
        highriseBuildingCatalog.addHighriseBuilding(highriseBuilding2);
    }

    public static void addBathhouseProject() {
        BathhouseProjectCatalog bathhouseProjectCatalog = BathhouseProjectCatalog.getBathhouseProjectCatalog();

        BathhouseProject bathhouseProject1 = new BathhouseProject(1, 40.0, 5.0,
         8.0, "", 14000.9, "Finnish");
        BathhouseProject bathhouseProject2 = new BathhouseProject(2, 30.0, 5.0,
         6.0, "", 12000.5, "Roman");
        BathhouseProject bathhouseProject3 = new BathhouseProject(3, 40.0, 5.0,
         8.0, "", 15000.0, "Finnish");
        BathhouseProject bathhouseProject4 = new BathhouseProject(4, 45.6, 9.0,
         5.08, "", 14900.0, "Roman");

        bathhouseProjectCatalog.addBathhouseProject(bathhouseProject1);
        bathhouseProjectCatalog.addBathhouseProject(bathhouseProject2);
        bathhouseProjectCatalog.addBathhouseProject(bathhouseProject3);
        bathhouseProjectCatalog.addBathhouseProject(bathhouseProject4);
    }

    public static void addHouseProject() {
    }

    public static void addBrigade() {
        BrigadeCatalog brigadeCatalog = BrigadeCatalog.getDepartmentCatalog();

        TechniqueCatalog techniqueCatalog = TechniqueCatalog.getTechniqueCatalog();

        List<Employee> employeeList001 = new ArrayList<>();
        employeeList001.add(EmployeeCatalog.getEmployeeCatalog().findEmployeeByPhoneNumber("+380503458974"));
        employeeList001.add(EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Maria", "Ivanenko"));
        employeeList001.add(EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Valeria", "Vasylenko"));
        employeeList001.add(EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Valeria", "Grizchenko"));

        Brigade brigade1 = new Brigade("001", employeeList001, techniqueCatalog.tiList(), 5000.0);

        List<Employee> employeeList002 = new ArrayList<>();
        employeeList002.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Diana", "Petrenko"));
        employeeList002.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Petro", "Mikulenko"));
        employeeList002.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Katerina", "Grizchenko"));
        employeeList002.add((Employee) EmployeeCatalog.getEmployeeCatalog().findEmployeeByFullName("Roman", "Miroshnichenko"));

        Brigade brigade2 = new Brigade("002", employeeList002, techniqueCatalog.tiList(), 7000.0);

        brigadeCatalog.addBrigade(brigade1);
        brigadeCatalog.addBrigade(brigade2);
    }

    public static void addMaterial() {
        MaterialCatalog materialCatalog = MaterialCatalog.getMaterialCatalog();

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

    public static void addTechnique() {
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

