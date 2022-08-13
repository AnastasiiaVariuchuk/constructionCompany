package main.constructionCompany.people.customer.catalog;

import main.constructionCompany.people.customer.Customer;

import java.util.Set;

public interface ICustomerCatalog {
    Customer addCustomer(Customer customer);

    Customer findEmployeeByPhoneNumber(String phoneNumber);

    Customer findEmployeeByPassport(String passport);

    Set<Customer> deleteArchitect(Customer customer);
}

