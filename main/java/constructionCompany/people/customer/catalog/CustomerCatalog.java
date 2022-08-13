package main.constructionCompany.people.customer.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.customer.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerCatalog implements ICustomerCatalog{
    private Set<Customer> customerSet = new HashSet<>();
    private static final CustomerCatalog CUSTOMER_CATALOG = new CustomerCatalog();

    public CustomerCatalog(){
    }

    public static CustomerCatalog getArchitectCatalog() {
        return CUSTOMER_CATALOG;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customerSet.add(customer);
        return customer;
    }

    @Override
    public Customer findEmployeeByPhoneNumber(String phoneNumber) {
        Customer customer = customerSet.stream().filter(customer1 -> customer1.getPhoneNumber().equals(phoneNumber)).findAny()
                .orElse(null);
        if(customer == null) {
            throw new NoSuchElementException("There was no such employee" + phoneNumber);
        }
        return customer;
    }

    @Override
    public Customer findEmployeeByPassport(String passport) {
        Customer customer = customerSet.stream().filter(customer1 -> customer1.getPassport().equals(passport)).findAny()
                .orElse(null);
        if(customer == null) {
            throw new NoSuchElementException("There was no such employee" + passport);
        }
        return customer;
    }

    @Override
    public Set<Customer> deleteArchitect(Customer customer) {
        if (customerSet.contains(customer)) {
            customerSet.remove(customer);
        } else {
            throw new NoSuchElementException("There was no such employee");
        }
        return customerSet;
    }
}
