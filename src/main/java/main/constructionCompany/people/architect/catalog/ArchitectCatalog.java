package main.constructionCompany.people.architect.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.architect.Architect;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArchitectCatalog implements IArchitectCatalog {
    private Set<Architect> architectSet = new HashSet<>();
    private static final ArchitectCatalog ARCHITECT_CATALOG = new ArchitectCatalog();

    public ArchitectCatalog(){
    }

    public static ArchitectCatalog getArchitectCatalog() {
        return ARCHITECT_CATALOG;
    }

    public Set<Architect> getArchitectSet() {
        return architectSet;
    }

    @Override
    public Architect addArchitect(Architect architect) {
        architectSet.add(architect);
        return architect;
    }

    @Override
    public Architect findEmployeeByPhoneNumber(String phoneNumber) {
        Architect employee = architectSet.stream().filter(employee1 -> employee1.getPhoneNumber().equals(phoneNumber)).findAny()
                .orElse(null);
        if(employee == null) {
            throw new NoSuchElementException("There was no such architect" + phoneNumber);
        }
        return employee;
    }

    @Override
    public Architect findArchitectByFullName(String name, String surname) {
        Architect employee = architectSet.stream()
                .filter(employee1 -> employee1.getName().equals(name) && employee1.getSurname().equals(surname))
                .findAny().orElse(null);;
        if(employee == null) {
            throw new NoSuchElementException("There was no such  architect" + name + surname);
        }
        return employee;
    }

    @Override
    public List<Architect> findArchitectByPosition(String position) {
        List<Architect> employees = architectSet.stream()
                .filter(employee1 -> employee1.getPosition().equals(position))
                .collect(Collectors.toList());
        return employees;
    }

    @Override
    public Set<Architect> deleteArchitect(Architect architect) {
        if (architectSet.contains(architect)) {
            architectSet.remove(architect);
        } else {
            throw new NoSuchElementException("There was no such architect");
        }
        return architectSet;
    }
}
