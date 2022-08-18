package main.constructionCompany;

import main.constructionCompany.actions.Registration;
import main.constructionCompany.taskUtils.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import static main.constructionCompany.actions.Order.ordering;

public class Main
{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        Task.task();
        ordering();
        try {
            Registration.registration();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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


        ///////////////////////////////////////////////////////////////////////////////////////////

        //1 - create collection of department


        //2 - create collection of employee


        //3 - create collection of techniques


        //4 - create collection of Brigade

        //5 - create collection of Brigade Estimates

        //6 - create collection of Material

        //7 - create collection of Material Estimate

        //8 - create collection of Estimate

        //9 - create collection of Bathhouse Projects

        //10 - create collection of Highrise Projects
    }
}