package constructionCompany.people.customer.catalog;

import constructionCompany.people.customer.Customer;

import java.util.Set;

public interface ICustomerCatalog {
    Customer addCustomer(Customer customer);

    Customer findEmployeeByPhoneNumber(String phoneNumber);

    Customer findEmployeeByPassport(String passport);

    Set<Customer> deleteCustomer(Customer customer);
}

