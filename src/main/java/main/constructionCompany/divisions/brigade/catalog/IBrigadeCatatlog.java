package main.constructionCompany.divisions.brigade.catalog;

import main.constructionCompany.divisions.brigade.Brigade;

import java.util.List;
import java.util.Set;

public interface IBrigadeCatatlog {
    Brigade addBrigade(Brigade brigade);

    Brigade findBrigadeByName(String name);

    Set<Brigade> deleteBrigade(Brigade brigade);

    List<Brigade> toList();
}
