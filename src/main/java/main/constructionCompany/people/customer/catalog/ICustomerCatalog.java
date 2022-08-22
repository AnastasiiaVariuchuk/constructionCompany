package main.constructionCompany.people.customer.catalog;

import main.constructionCompany.people.customer.Customer;

import java.util.List;
import java.util.Set;

public interface ICustomerCatalog {
    Customer addCustomer(Customer customer);

    Customer findCustomerByPhoneNumber(String phoneNumber);

    Customer findCustomerByPassport(String passport);

    Set<Customer> deleteCustomer(Customer customer);

    List<Customer> toList();
}

