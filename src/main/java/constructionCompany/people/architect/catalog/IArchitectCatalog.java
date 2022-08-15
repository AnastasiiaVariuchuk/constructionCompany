package constructionCompany.people.architect.catalog;

import constructionCompany.people.architect.Architect;

import java.util.List;
import java.util.Set;

public interface IArchitectCatalog {
    Architect addArchitect(Architect architect);

    Architect findEmployeeByPhoneNumber(String phoneNumber);

    List<Architect> findArchitectByFullName(String name, String surname);

    Set<Architect> deleteArchitect(Architect architect);
}
