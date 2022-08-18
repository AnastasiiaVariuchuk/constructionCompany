package main.constructionCompany.people.employees.catalog;

import main.constructionCompany.divisions.department.catalog.Department;
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
    Employee findEmployeeByFullName(String name, String surname);

    /**
     * Finds employee by employee`s possition
     * */
    List<Employee> findEmployeeByPosition(String position);

    /**
     * Finds employee by employee`s department
     * */

    List<Employee> findEmployeeByDepartment(Department department);

    /**
     * Deletes employee from the repository if it is present
     */
    Set<Employee> deleteEmployee(Employee employee);
}
