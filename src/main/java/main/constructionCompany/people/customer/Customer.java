package main.constructionCompany.people.customer;

import main.constructionCompany.people.Person;

import java.util.Objects;

public class Customer extends Person {
    private String passport;
    private String password;

    public Customer() {
    }

    public Customer(String name, String surname, String phoneNumber, int age,
                    String passport) {
        super(name,surname,phoneNumber, age);
        this.passport = passport;
    }

    public Customer(String name, String surname, String phoneNumber, int age,
                    String passport, String password) {
        super(name,surname,phoneNumber, age);
        this.passport = passport;
        this.password = password;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [\nname => " + super.getName()
                + "\nsurname => " + super.getSurname()
                + "\nphone number => " + super.getPhoneNumber()
                + "\nage => " + super.getAge() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Customer c = (Customer) obj;
        return Objects.equals(getName(), c.getName())
                && Objects.equals(getSurname(), c.getSurname())
                && Objects.equals(getPhoneNumber(), c.getPhoneNumber())
                && (getAge() == c.getAge())
                && Objects.equals(password, c.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getSurname().hashCode(), getPhoneNumber().hashCode(),
                getAge(), password.hashCode());
    }
}

