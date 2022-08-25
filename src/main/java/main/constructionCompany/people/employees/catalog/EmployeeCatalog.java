package main.constructionCompany.people.employees.catalog;

import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.employees.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeCatalog implements IEmployeeCatalog{
    private Set<Employee> employeeSet = new HashSet<>();
    private static final EmployeeCatalog EMPLOYEE_CATALOG = new EmployeeCatalog();

    public EmployeeCatalog() {
    }

    public static EmployeeCatalog getEmployeeCatalog() {
        return EMPLOYEE_CATALOG;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeSet.add(employee);
        return employee;
    }

    @Override
    public Employee findEmployeeByPhoneNumber(String phoneNumber) {
        Employee employee = employeeSet.stream().filter(employee1 -> employee1.getPhoneNumber().equals(phoneNumber)).findAny()
                .orElse(null);
        if(employee == null) {
            throw new NoSuchElementException("There was no such employee" + phoneNumber);
        }
        return employee;
    }

    @Override
    public Employee findEmployeeByFullName(String name, String surname) {
        Employee employee = employeeSet.stream().filter(employee1 -> employee1.getName().equals(name)
                        && employee1.getSurname().equals(surname)).findAny().orElse(null);
        if(employee == null) {
            throw new NoSuchElementException("There was no such employee" + name + surname);
        }
        return employee;
    }

    @Override
    public List<Employee> findEmployeeByPosition(String position) {
        List<Employee> employees = employeeSet.stream()
                .filter(employee1 -> employee1.getPosition().equals(position))
                .collect(Collectors.toList());
        if(employees == null) {
            throw new NoSuchElementException("There was no such employee" + position);
        }
        return employees;
    }

    @Override
    public List<Employee> findEmployeeByDepartment(Department department) {
        List<Employee> employees = employeeSet.stream()
                .filter(employee1 -> employee1.getDepartment().equals(department))
                .collect(Collectors.toList());
        if(employees == null) {
            throw new NoSuchElementException("There was no such employee" + department);
        }
        return employees;
    }

    @Override
    public Set<Employee> deleteEmployee(Employee employee) {
        if (employeeSet.contains(employee)) {
            employeeSet.remove(employee);
        } else {
            throw new NoSuchElementException("There was no such employee");
        }
        return employeeSet;
    }

    public Employee findEmployeeByNameSurname(String name, String surname) {
        Employee employee = employeeSet.stream().filter(employee1 -> employee1.getName().equals(name)
                && employee1.getSurname().equals(surname)).findAny().orElse(null);
        return employee;
    }
}
