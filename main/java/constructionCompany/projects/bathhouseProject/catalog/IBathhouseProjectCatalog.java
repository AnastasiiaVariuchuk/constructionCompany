package main.constructionCompany.projects.bathhouseProject.catalog;

import java.util.List;
import java.util.Set;

public interface IBathhouseProjectCatalog {
    BathhouseProjectCatalog addBathhouseProjectCatalog(BathhouseProjectCatalog bathhouseProjectCatalog);

    BathhouseProjectCatalog findBathhouseProjectByNumber(int number);

    List<BathhouseProjectCatalog> findBathhouseProjectByBathhouseType(String bathhouseType);

    Set<BathhouseProjectCatalog> deleteBathhouseProjectCatalog(BathhouseProjectCatalog bathhouseProjectCatalog);
}
