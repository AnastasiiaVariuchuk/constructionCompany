package main.constructionCompany.actions;

import main.constructionCompany.catalog.Creator;
import main.constructionCompany.enums.Discount;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.customer.catalog.CustomerCatalog;
import main.constructionCompany.projects.TypeProject;
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
            TypeProject typeProject = Choice.projectChoice();
            typeProject.getOrder();
            double price = Calculate.getPrice(Creator.createNewProject(customer, typeProject));
            double price1 = 0;
            if (CustomerCatalog.getCustomerCatalog().findCustomerByPhoneNumber(customer.getPhoneNumber()) != null) {
                price1 = price - price * Discount.CUSTOMER.getDiscount()/100;
                if (Creator.getConstructionCompany().isRegularCustomer(customer)) {
                    logger.info("Status => RegularCustomer: -10%");
                    price1 = price - price * Discount.REGULAR_CUSTOMER.getDiscount()/100;
                    if (Creator.getConstructionCompany().isEmployee(customer)) {
                        logger.info("Status => RegularCustomer and Employee: -30%");
                        price1 = price - price * (Discount.REGULAR_CUSTOMER.getDiscount()
                                + Discount.EMPLOYEE.getDiscount())/100;
                        if (Creator.getConstructionCompany().isArchitect(customer)) {
                            logger.info("Status => RegularCustomer and Architect: -35%");
                            price1 = price - price * (Discount.REGULAR_CUSTOMER.getDiscount()
                                    + Discount.ARCHITECT.getDiscount())/100;
                        }
                    }
                } else if (Creator.getConstructionCompany().isEmployee(customer)
                        && Creator.getConstructionCompany().isRegularCustomer(customer) == false) {
                    logger.info("Status => Employee: -20%");
                    price1 = price - price * Discount.EMPLOYEE.getDiscount()/100;
                    if (Creator.getConstructionCompany().isArchitect(customer)) {
                        logger.info("Status => Architect: -35%");
                        price1 = price - price * Discount.ARCHITECT.getDiscount()/100;
                    }
                } else {
                    logger.info("Status => Customer!!!");
                }
                logger.info("Total price => " + price1);
            }
        }
    }
}
