package main.constructionCompany.people.architect.catalog;

import main.constructionCompany.people.architect.Architect;

import java.util.List;
import java.util.Set;

public interface IArchitectCatalog {
    Architect addArchitect(Architect architect);

    Architect findEmployeeByPhoneNumber(String phoneNumber);

    Architect findArchitectByFullName(String name, String surname);

    List<Architect> findArchitectByPosition(String position);

    Set<Architect> deleteArchitect(Architect architect);
}
