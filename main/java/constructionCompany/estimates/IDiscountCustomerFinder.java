package main.constructionCompany.estimates;

import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.projects.Project;

import java.util.List;

public interface IDiscountCustomerFinder {
    boolean isRegularCustomer(Customer customer);
    List<Double> getPriceWithDiscount(Customer customer);
    List<Project> getProjectsForDiscount(Customer customer);
}
