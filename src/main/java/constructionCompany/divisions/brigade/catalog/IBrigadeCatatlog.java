package constructionCompany.divisions.brigade.catalog;

import constructionCompany.divisions.brigade.Brigade;

import java.util.Set;

public interface IBrigadeCatatlog {
    Brigade addBrigade(Brigade brigade);

    Brigade findBrigadeByName(String name);

    Set<Brigade> deleteBrigade(Brigade brigade);
}
