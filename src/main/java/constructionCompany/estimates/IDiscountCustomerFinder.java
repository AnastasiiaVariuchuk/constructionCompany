package constructionCompany.estimates;

import constructionCompany.people.customer.Customer;
import constructionCompany.projects.Project;

import java.util.List;

public interface IDiscountCustomerFinder {
    boolean isRegularCustomer(Customer customer);
    List<Double> getPriceWithDiscount(Customer customer);
    List<Project> getProjectsForDiscount(Customer customer);
}
