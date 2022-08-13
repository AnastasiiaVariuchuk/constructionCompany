package main.constructionCompany.people.employees;

import main.constructionCompany.divisions.Department;
import main.constructionCompany.people.Person;

import java.util.Objects;

public class Employee extends Person {
    private String position;
    private double salary;
    private Department department;

    public Employee() {
    }

    public Employee(String name, String surname, String phoneNumber,
                    String position, int age, double salary, Department department)  {
        super(name, surname, phoneNumber, age);
        this.position = position;
        this.salary = salary;
        this.department = department;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [\nname => " + super.getName()
                + "\nsurname => " + super.getSurname()
                + "\nphone number => " + super.getPhoneNumber()
                + "\nage => " + super.getAge()
                + "\nposition => " + position
                + "\nsalary => " + salary
                + "\ndepartment => " + department.toString() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Employee e = (Employee) obj;
        return Objects.equals(getName(), e.getName())
                && Objects.equals(getSurname(), e.getSurname())
                && Objects.equals(getPhoneNumber(), e.getPhoneNumber())
                && (getAge() == e.getAge())
                && Objects.equals(position, e.position)
                && (salary == e.salary)
                && (department == e.department || (department != null && department.equals(e.getDepartment())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getSurname().hashCode(), getPhoneNumber().hashCode(),
                getPosition().hashCode(), getAge(), getSalary(), getDepartment().hashCode());
    }
}
