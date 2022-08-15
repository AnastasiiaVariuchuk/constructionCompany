package constructionCompany.projects.highriseBuilding.catalog;

import constructionCompany.projects.highriseBuilding.HighriseBuilding;

import java.util.List;
import java.util.Set;

public interface IHighriseBuildingCatalog {
    HighriseBuilding addHighriseBuildingCatalog(HighriseBuilding highriseBuilding);

    HighriseBuilding findHighriseBuildingByNumber(int number);

    List<HighriseBuilding> findHighriseBuildingByUsageType(String usageType);

    Set<HighriseBuilding> deleteHighriseBuildingCatalog(HighriseBuilding highriseBuilding);
}
