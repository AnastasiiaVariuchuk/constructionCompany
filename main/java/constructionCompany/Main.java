package main.constructionCompany;

import main.constructionCompany.divisions.Brigade;
import main.constructionCompany.divisions.Department;
import main.constructionCompany.estimates.BrigadeEstimate;
import main.constructionCompany.estimates.Estimate;
import main.constructionCompany.estimates.MaterialEstimate;
import main.constructionCompany.myExceptions.ProjectNotFoundedException;
import main.constructionCompany.people.architect.Architect;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.employees.Employee;
import main.constructionCompany.projects.*;
import main.constructionCompany.projects.bathhouseProject.BathhouseProject;
import main.constructionCompany.reserves.Material;
import main.constructionCompany.reserves.Site;
import main.constructionCompany.reserves.Technique;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main
{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        Department department1 = new Department("Architectural");
        Architect a;
        a = new Architect("Anna", "Koval", "+380997896655", "ttt", -85,60000.00, department1, 8);
        System.out.println(a);
        HighriseBuilding h;
        h = new HighriseBuilding(3, -150, 19, 25, "description", 8, -9, "for 1 family");
        h.getOrder();
        Estimate e1  = new Estimate(); Estimate e2  = new Estimate(); Estimate e3  = new Estimate();
        List<Estimate> estimateList = new ArrayList<>();
        estimateList.add(e1); estimateList.add(e2); estimateList.add(e3);
        BuildingPlan b1 = new BuildingPlan();
        BuildingPlan b2 = new BuildingPlan(); BuildingPlan b3 = new BuildingPlan();
        List<BuildingPlan> buildingPlanList = new ArrayList<>();
        buildingPlanList.add(b1); buildingPlanList.add(b2); buildingPlanList.add(b3);
        Customer c = new Customer(); Site s = new Site(); Date date = new Date();
        Project p = new Project(111, 333000.0, c, estimateList, buildingPlanList, s, h, date);
        List<Project> projectList = new ArrayList<>(); projectList.add(p);
        ProjectManager projectManager = new ProjectManager(projectList);
        logger.info("llllll");
        try {
            Project project = projectManager.check(111);
        } catch (ProjectNotFoundedException e) {
            logger.error(e);
        }
        logger.info("llllll");

        ///////////////////////////////////////////////////////////////////////////////////////////

        //1 - create collection of departments
        Set<Department> departmentSet = new HashSet<>();
        List<Employee> employeeList = new ArrayList<>();


        Department department2 = new Department("Design", "", employeeList);
        Department department3 = new Department("Construction", "", employeeList);
        Department department4 = new Department("Technical", "", employeeList);

        departmentSet.add(department1);departmentSet.add(department2);
        departmentSet.add(department3);departmentSet.add(department4);

        //2 - create collection of employee
        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        Architect architect1 = new Architect("Katerina", "Grizchenko", "+380503458961",
                "", 40,  61000.0, department1, 9);
        Architect architect2 = new Architect("Valeria", "Grizchenko", "+380503458962",
                "", 43,  61000.0, department1, 12);
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

        employeeMap.put(architect1.getPhoneNumber(), architect1);
        employeeMap.put(architect2.getPhoneNumber(), architect2);
        employeeMap.put(employee1.getPhoneNumber(), employee1); employeeMap.put(employee2.getPhoneNumber(), employee2);
        employeeMap.put(employee3.getPhoneNumber(), employee3); employeeMap.put(employee4.getPhoneNumber(), employee4);
        employeeMap.put(employee5.getPhoneNumber(), employee5); employeeMap.put(employee6.getPhoneNumber(), employee6);
        employeeMap.put(employee7.getPhoneNumber(), employee7);

        //3 - create collection of techniques
        List<Technique> techniqueList = new ArrayList<>();

        Technique technique1 = new Technique("Sennebogen S 613R", "Telekran", 4000.0);
        Technique technique2 = new Technique("Sennebogen S 60 8p", "Telekran", 4000.0);
        Technique technique3 = new Technique("Hamm H 13r", "Single roller skating rink", 3300.0);
        Technique technique4 = new Technique("Takeuchi p66j8", "Excavator", 5400.0);
        Technique technique5 = new Technique("Takeuchi p66j0", "Excavator", 4500.0);

        techniqueList.add(technique1);techniqueList.add(technique2);techniqueList.add(technique3);
        techniqueList.add(technique4);techniqueList.add(technique5);

        //4 - create collection of Brigade
        Map<String, Brigade> brigadeMap = new HashMap<>();

        //4.1
        List<Employee> employeeList001 = new ArrayList<>();
        employeeList001.add(employee1); employeeList001.add(employee4); employeeList001.add(employee5);
        employeeList001.add(architect1);

        Brigade brigade1 = new Brigade("001", employeeList001, techniqueList, 5000.0);

        //4.2
        List<Employee> employeeList002 = new ArrayList<>();
        employeeList002.add(employee2); employeeList002.add(employee5); employeeList002.add(employee6);
        employeeList002.add(architect2);

        Brigade brigade2 = new Brigade("002", employeeList002, techniqueList, 7000.0);

        //5 - create collection of Brigade Estimates
        Map<Integer, BrigadeEstimate> brigadeEstimateMap1 = new HashMap<>();
        Map<Integer, BrigadeEstimate> brigadeEstimateMap2 = new HashMap<>();

        BrigadeEstimate brigadeEstimate1 = new BrigadeEstimate(brigade1, 1, 47);
        BrigadeEstimate brigadeEstimate2 = new BrigadeEstimate(brigade2, 2, 34);
        BrigadeEstimate brigadeEstimate3 = new BrigadeEstimate(brigade1, 3, 30);
        BrigadeEstimate brigadeEstimate4 = new BrigadeEstimate(brigade2, 4, 29);
        BrigadeEstimate brigadeEstimate5 = new BrigadeEstimate(brigade1, 5, 87);

        brigadeEstimateMap1.put(brigadeEstimate1.getCode(), brigadeEstimate1);
        brigadeEstimateMap2.put(brigadeEstimate2.getCode(), brigadeEstimate2);
        brigadeEstimateMap1.put(brigadeEstimate3.getCode(), brigadeEstimate3);
        brigadeEstimateMap2.put(brigadeEstimate4.getCode(), brigadeEstimate4);
        brigadeEstimateMap1.put(brigadeEstimate5.getCode(), brigadeEstimate5);

        //6 - create collection of Material
        List<Material> materialList = new ArrayList<>();

        Material material1 = new Material("Brick", "001", 2000);
        Material material2 = new Material("Ceramic stones (ceramic blocks)", "001", 2400);
        Material material3 = new Material("Blocks Teplosten", "001", 2200);
        Material material4 = new Material("Foam and aerated concrete blocks", "001", 2600);
        Material material5 = new Material("Log and timber", "002", 4000);
        Material material6 = new Material("Wooden frame.", "002", 3800);
        Material material7 = new Material("Panel sip.", "003", 2300);
        Material material8 = new Material("Granite", "004", 9000);
        Material material9 = new Material("Dye", "005", 1000);

        materialList.add(material1);materialList.add(material2);materialList.add(material3);materialList.add(material4);
        materialList.add(material5);materialList.add(material6);materialList.add(material7);materialList.add(material8);
        materialList.add(material9);

        //7 - create collection of Material Estimate
        Map<Integer,MaterialEstimate> materialEstimateMap1 = new HashMap<>();
        Map<Integer,MaterialEstimate> materialEstimateMap2 = new HashMap<>();

        MaterialEstimate materialEstimate1 = new MaterialEstimate(material1, 1, 45.9);
        MaterialEstimate materialEstimate2 = new MaterialEstimate(material2, 2, 67.1);
        MaterialEstimate materialEstimate3 = new MaterialEstimate(material3, 3, 95.4);
        MaterialEstimate materialEstimate4 = new MaterialEstimate(material4, 4, 15.9);
        MaterialEstimate materialEstimate5 = new MaterialEstimate(material5, 5, 35.7);
        MaterialEstimate materialEstimate6 = new MaterialEstimate(material6, 6, 5.9);
        MaterialEstimate materialEstimate7 = new MaterialEstimate(material7, 7, 85.3);
        MaterialEstimate materialEstimate8 = new MaterialEstimate(material8, 8, 45.9);
        MaterialEstimate materialEstimate9 = new MaterialEstimate(material9, 9, 47.4);

        materialEstimateMap1.put(materialEstimate1.getCode(), materialEstimate1);
        materialEstimateMap2.put(materialEstimate2.getCode(), materialEstimate2);
        materialEstimateMap1.put(materialEstimate3.getCode(), materialEstimate3);
        materialEstimateMap2.put(materialEstimate4.getCode(), materialEstimate4);
        materialEstimateMap1.put(materialEstimate5.getCode(), materialEstimate5);
        materialEstimateMap2.put(materialEstimate6.getCode(), materialEstimate6);
        materialEstimateMap1.put(materialEstimate7.getCode(), materialEstimate7);
        materialEstimateMap2.put(materialEstimate8.getCode(), materialEstimate8);
        materialEstimateMap1.put(materialEstimate9.getCode(), materialEstimate9);

        //8 - create collection of Estimate
        Set<Estimate> estimateSet1 =  new HashSet<>();
        Set<Estimate> estimateSet2 =  new HashSet<>();
        Set<Estimate> estimateSet3 =  new HashSet<>();
        Set<Estimate> estimateSet4 =  new HashSet<>();

        Estimate estimate1 = new Estimate(1, (List<BrigadeEstimate>) brigadeEstimateMap1,
                                         (List<MaterialEstimate>) materialEstimateMap1);
        Estimate estimate2 = new Estimate(2, (List<BrigadeEstimate>) brigadeEstimateMap2,
                (List<MaterialEstimate>) materialEstimateMap2);
        Estimate estimate3 = new Estimate(3, (List<BrigadeEstimate>) brigadeEstimateMap1,
                (List<MaterialEstimate>) materialEstimateMap2);
        Estimate estimate4 = new Estimate(2, (List<BrigadeEstimate>) brigadeEstimateMap2,
                (List<MaterialEstimate>) materialEstimateMap1);

        estimateSet1.add(estimate1);estimateSet1.add(estimate2);estimateSet1.add(estimate3);
        estimateSet2.add(estimate1);estimateSet2.add(estimate4);estimateSet2.add(estimate3);
        estimateSet3.add(estimate3);estimateSet3.add(estimate2);estimateSet3.add(estimate4);
        estimateSet4.add(estimate1);estimateSet4.add(estimate2);estimateSet4.add(estimate3);estimateSet4.add(estimate4);

        //9 - create collection of Bathhouse Projects
        Queue<BathhouseProject> bathhouseProjectQueue = new Queue<BathhouseProject>() {
            @Override
            public boolean add(BathhouseProject bathhouseProject) {
                return false;
            }

            @Override
            public boolean offer(BathhouseProject bathhouseProject) {
                return false;
            }

            @Override
            public BathhouseProject remove() {
                return null;
            }

            @Override
            public BathhouseProject poll() {
                return null;
            }

            @Override
            public BathhouseProject element() {
                return null;
            }

            @Override
            public BathhouseProject peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<BathhouseProject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends BathhouseProject> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        BathhouseProject bathhouseProject1 = new BathhouseProject(1, 40.0, 5.0,
                8.0, "", 14000.9, "Finnish");
        BathhouseProject bathhouseProject2 = new BathhouseProject(2, 30.0, 5.0,
                6.0, "", 12000.5, "Roman");
        BathhouseProject bathhouseProject3 = new BathhouseProject(3, 40.0, 5.0,
                8.0, "", 15000.0, "Finnish");
        BathhouseProject bathhouseProject4 = new BathhouseProject(4, 45.6, 9.0,
                5.08, "", 14900.0, "Roman");

        bathhouseProjectQueue.add(bathhouseProject1);bathhouseProjectQueue.add(bathhouseProject2);
        bathhouseProjectQueue.add(bathhouseProject3);bathhouseProjectQueue.add(bathhouseProject4);

        //10 - create collection of Highrise Projects
        Queue<HighriseBuilding> highriseBuildingQueue = new Queue<HighriseBuilding>() {
            @Override
            public boolean add(HighriseBuilding highriseBuilding) {
                return false;
            }

            @Override
            public boolean offer(HighriseBuilding highriseBuilding) {
                return false;
            }

            @Override
            public HighriseBuilding remove() {
                return null;
            }

            @Override
            public HighriseBuilding poll() {
                return null;
            }

            @Override
            public HighriseBuilding element() {
                return null;
            }

            @Override
            public HighriseBuilding peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<HighriseBuilding> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends HighriseBuilding> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        HighriseBuilding highriseBuilding1 = new HighriseBuilding(1, 1000.0, 20.0,
                50.0, "", 140000.0, 6,"commerce");
        HighriseBuilding highriseBuilding2 = new HighriseBuilding(2, 3000.0, 30.0,
                100.0, "", 14000.9, 10,"Private");

        highriseBuildingQueue.add(highriseBuilding1); highriseBuildingQueue.add(highriseBuilding2);


    }
}