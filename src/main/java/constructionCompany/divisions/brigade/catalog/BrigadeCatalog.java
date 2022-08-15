package constructionCompany.divisions.brigade.catalog;

import constructionCompany.divisions.brigade.Brigade;
import constructionCompany.myExceptions.NoSuchElementException;

import java.util.HashSet;
import java.util.Set;

public class BrigadeCatalog implements IBrigadeCatatlog {
    private Set<Brigade> brigadeSet = new HashSet<>();
    private static final BrigadeCatalog BRIGADE_CATALOG= new BrigadeCatalog();

    public BrigadeCatalog(){
    }

    public static BrigadeCatalog getDepartmentCatalog() {
        return BRIGADE_CATALOG;
    }

    public static BrigadeCatalog getBrigadeCatalog() {
        return BRIGADE_CATALOG;
    }

    @Override
    public Brigade addBrigade(Brigade brigade) {
        brigadeSet.add(brigade);
        return brigade;
    }

    @Override
    public Brigade findBrigadeByName(String name) {
        Brigade brigade = brigadeSet.stream().filter(department1 -> department1.getName().equals(name)).findAny()
                .orElse(null);
        if(brigade == null) {
            throw new NoSuchElementException("There was no such brigade" + name);
        }
        return brigade;
    }

    @Override
    public Set<Brigade> deleteBrigade(Brigade brigade) {
        if (brigadeSet.contains(brigade)) {
            brigadeSet.remove(brigade);
        } else {
            throw new NoSuchElementException("There was no such brigade");
        }
        return brigadeSet;
    }
}
