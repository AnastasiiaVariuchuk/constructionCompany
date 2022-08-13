package main.constructionCompany.people.employees.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.employees.Employee;

import java.util.List;
import java.util.Set;

public interface IEmployeeCatalog {
    /**
     * Adds employee to the repository
     */
    Employee addEmployee(Employee employee);

    /**
     * Finds employee by employee`s phone number
     */
    Employee findEmployeeByPhoneNumber(String phoneNumber);

    /**
     * Finds employee by employee`s full name
     * */
    List<Employee> findEmployeeByFullName(String name, String surname);

    /**
     * Finds employee by employee`s possiyion
     * */
    List<Employee> findEmployeeByPosition(String position);

    /**
     * Deletes employee from the repository if it is present
     */
    Set<Employee> deleteEmployee(Employee employee) throws NoSuchElementException;
}
