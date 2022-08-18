package main.constructionCompany.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static main.constructionCompany.actions.Choice.serviceChoice;

public class Order {
    private final static Logger logger = LogManager.getLogger(Order.class);

    // create an order
    public static void ordering() {
        serviceChoice();
    }
}
