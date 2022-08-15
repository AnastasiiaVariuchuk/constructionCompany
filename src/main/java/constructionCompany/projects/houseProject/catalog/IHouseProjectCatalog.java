package constructionCompany.projects.houseProject.catalog;

import constructionCompany.projects.houseProject.HouseProject;

import java.util.List;
import java.util.Set;

public interface IHouseProjectCatalog {
    HouseProject addHouseProjectCatalog(HouseProject houseProject);

    HouseProject findHouseProjectByNumber(int number);

    List<HouseProject> findHouseProjectByFamilySize(String familyType);

    Set<HouseProject> deleteHouseProjectCatalog(HouseProject houseProject);
}
