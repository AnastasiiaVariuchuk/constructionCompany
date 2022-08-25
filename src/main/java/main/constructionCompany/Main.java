package main.constructionCompany;

import main.constructionCompany.actions.Order;
import main.constructionCompany.catalog.Catalog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main
{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        //Customer customer1 = new Customer("Anastasiia", "Variuchuk", "+380995674356", 19, "12345678");
        //Customer customer2 = new Customer("Ivanna", "Phenichna", "+380995674365", 39, "12345342121");
        //Customer customer3 = new Customer("Valeria", "Grizchenko", "+380503458962", 43, "1234567890");
        Catalog.filling();
        Order.ordering();
    }
}