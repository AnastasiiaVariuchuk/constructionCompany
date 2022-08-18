package main.constructionCompany.estimates;

import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.people.employees.Employee;

import java.util.List;

public interface IDiscountEmployeeFinder {
    Customer isCustomer(Employee employee);
    List<Double> getPriceWithDiscountForEmployee(Employee employee);
}
