package main.constructionCompany.estimates;

import main.constructionCompany.people.customer.Customer;
public interface IDiscountCustomerFinder {
    boolean isRegularCustomer(Customer customer);
    boolean isEmployee(Customer customer);
    boolean isArchitect(Customer customer);
}
