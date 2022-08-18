package main.constructionCompany.reserves.technique.catalog;

import main.constructionCompany.reserves.technique.Technique;

import java.util.List;
import java.util.Set;

public interface ITechniqueCatalog {
    Technique addTechnique(Technique technique);

    Technique findTechniqueByNameModel(String nameModel);

    List<Technique> findEmployeeByType(String type);

    Set<Technique> deleteTechnique(Technique technique);
    List<Technique> tiList();

}

