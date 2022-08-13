package main.constructionCompany.people;

import main.constructionCompany.myExceptions.NegativeNumberException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person {
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private static final Logger logger = LogManager.getLogger(Person.class);

    public Person() {
    }

    public Person(String name, String surname, String phoneNumber, int age)  {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        if (age < 0) {
            logger.error("AgeException: you entered the age less then 0");
            throw new NegativeNumberException();
        } else if (age < 18) {
            logger.error("AgeException: you entered the age less then 18");
            throw new NegativeNumberException();
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            logger.error("AgeException: you entered the age less then 0");
            throw new NegativeNumberException();
        } else if (age < 18) {
            logger.error("AgeException: you entered the age less then 18");
            throw new NegativeNumberException();
        } else {
            this.age = age;
        }
    }

    public abstract String toString();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
