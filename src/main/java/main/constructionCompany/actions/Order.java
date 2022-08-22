package main.constructionCompany.actions;

import main.constructionCompany.catalog.Creator;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.customer.catalog.CustomerCatalog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Order {
    private final static Logger logger = LogManager.getLogger(Order.class);

    public static void ordering() {
        Creator.getCustomers();
        Customer customer = new Customer();
        if (Choice.serviceChoice()) {
            try {
                customer = Registration.registration();
                CustomerCatalog.getCustomerCatalog().addCustomer(customer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Choice.projectChoice().getOrder();
            if (CustomerCatalog.getCustomerCatalog().findCustomerByPhoneNumber(customer.getPhoneNumber()) != null) {
                if (Creator.getConstructionCompany().isRegularCustomer(customer)) {
                    logger.info("RegularCustomer");
                    if (Creator.getConstructionCompany().isEmployee(customer)) {
                        logger.info("RegularCustomer and Employee");
                        if (Creator.getConstructionCompany().isArchitect(customer)) {
                            logger.info("RegularCustomer and Employee and Architect");
                        }
                    }
                } else if (Creator.getConstructionCompany().isEmployee(customer)) {
                    logger.info("Employee");
                    if (Creator.getConstructionCompany().isArchitect(customer)) {
                        logger.info("Employee and Architect");
                    }
                }
            }
        }
    }
}
