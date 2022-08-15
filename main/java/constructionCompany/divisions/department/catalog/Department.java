package main.constructionCompany.divisions;

import main.constructionCompany.people.employees.Employee;

import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private String phoneNumber;
    private List<Employee> employees;

    public Department() {
    }

    public Department(String name){
        this.name = name;
    }

    public Department(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Department(String name, String phoneNumber,
                      List<Employee> employees) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department [\nname => " + name
                + "\nphone number => " + phoneNumber + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Department d = (Department) obj;
        return (name == d.name || (name != null && name.equals(d.getName())))
                && (employees == d.employees || (employees != null && employees.equals(d.getEmployees())))
                && (phoneNumber == d.phoneNumber || (phoneNumber != null && phoneNumber.equals(d.getPhoneNumber())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.hashCode(), phoneNumber.hashCode(),  employees.hashCode());
    }
}
