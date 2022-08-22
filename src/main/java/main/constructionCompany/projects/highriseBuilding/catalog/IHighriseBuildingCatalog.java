package main.constructionCompany.projects.highriseBuilding.catalog;

import main.constructionCompany.projects.highriseBuilding.HighriseBuilding;

import java.util.List;
import java.util.Set;

public interface IHighriseBuildingCatalog {
    HighriseBuilding addHighriseBuilding(HighriseBuilding highriseBuilding);

    HighriseBuilding findHighriseBuildingByNumber(int number);

    List<HighriseBuilding> findHighriseBuildingByUsageType(String usageType);

    Set<HighriseBuilding> deleteHighriseBuildingCatalog(HighriseBuilding highriseBuilding);

    public List<HighriseBuilding> toList();
}
