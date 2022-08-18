package main.constructionCompany.people.architect;

import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.people.employees.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Architect extends Employee {
    private final String position = "Architect";
    private int experience;
    private static final Logger logger = LogManager.getLogger(Architect.class);

    public Architect(){
    }
    public Architect(String name, String surname, String phoneNumber, String position, int age, double salary,
                     Department department, int experience) {
        super(name,
                surname,
                phoneNumber,
                position,
                age,
                salary,
                department);
        if (experience < 0) {
            logger.error("AgeException: you entered the age less then 0");
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            logger.error("AgeException: you entered the age less then 0");
        } else {
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Architect [\nname => " + super.getName()
                + "\nsurname => " + super.getSurname()
                + "\nphone number => " + super.getPhoneNumber()
                + "\nposition => " + position
                + "\nage => " + super.getAge()
                + "\nsalary => " + super.getSalary()
                + "\ndepartment => " + super.getDepartment().toString()
                + "\nexperience => " + experience + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Architect a = (Architect) obj;
        return Objects.equals(getName(), a.getName())
                && Objects.equals(getSurname(), a.getSurname())
                && Objects.equals(getPhoneNumber(), a.getPhoneNumber())
                && Objects.equals(getPosition(), a.getPosition())
                && (getAge() == a.getAge())
                && (getSalary() == a.getSalary())
                && experience == a.experience
                && (getDepartment() == a.getDepartment()
                || (getDepartment() != null && getDepartment().equals(a.getDepartment())));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getSurname().hashCode(), getPhoneNumber().hashCode(),
                getPosition().hashCode(), getAge(), getSalary(), experience, getDepartment().hashCode());
    }
}
