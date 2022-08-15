package constructionCompany.estimates;

import constructionCompany.people.customer.Customer;
import constructionCompany.people.employees.Employee;

import java.util.List;

public interface IDiscountEmployeeFinder {
    Customer isCustomer(Employee employee);
    List<Double> getPriceWithDiscountForEmployee(Employee employee);
}
