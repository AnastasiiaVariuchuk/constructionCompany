package main.constructionCompany;

import main.constructionCompany.actions.Order;
import main.constructionCompany.catalog.Catalog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        Catalog.filling();
        Order.ordering();
        //For Task2

        //Task2Main.getDeclaredFields();
        //Task2Main.getDeclaredField();
        //Task2Main.getFields();
        //Task2Main.getField();

        //Task2Main.getDeclaredMethods();
        //Task2Main.getDeclaredMethod();
        //Task2Main.getEnclosingMethod();
        //Task2Main.setAccessible1();
        //Task2Main.setAccessible2();

        //Task2Main.interfaceCheck();

        /**
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
         */

    }
}