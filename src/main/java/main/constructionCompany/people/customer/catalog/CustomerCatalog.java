package main.constructionCompany.people.customer.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.customer.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerCatalog implements ICustomerCatalog{
    private Set<Customer> customerSet = new HashSet<>();
    private static final CustomerCatalog CUSTOMER_CATALOG = new CustomerCatalog();

    public CustomerCatalog(){
    }

    public static CustomerCatalog getCustomerCatalog() {
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
    public Customer findCustomerByPhoneNumber(String phoneNumber) {
        Customer customer = customerSet.stream().filter(customer1 -> customer1.getPhoneNumber().equals(phoneNumber)).findAny()
                .orElse(null);
        if(customer == null) {
            throw new NoSuchElementException("There was no such customer" + phoneNumber);
        }
        return customer;
    }

    @Override
    public Customer findCustomerByPassport(String passport) {
        Customer customer = customerSet.stream().filter(customer1 -> customer1.getPassport().equals(passport)).findAny()
                .orElse(null);
        if(customer == null) {
            throw new NoSuchElementException("There was no such customer" + passport);
        }
        return customer;
    }

    @Override
    public Set<Customer> deleteCustomer(Customer customer) {
        if (customerSet.contains(customer)) {
            customerSet.remove(customer);
        } else {
            throw new NoSuchElementException("There was no such customer");
        }
        return customerSet;
    }

    public List<Customer> toList() {
        List<Customer> list = new ArrayList<>();
        for (Customer element : customerSet) {
            list.add(element);
        }
        return list;
    }
}
