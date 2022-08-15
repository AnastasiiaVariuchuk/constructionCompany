package constructionCompany.projects.bathhouseProject.catalog;

import constructionCompany.projects.bathhouseProject.BathhouseProject;

import java.util.List;
import java.util.Set;

public interface IBathhouseProjectCatalog {
    BathhouseProject addBathhouseProjectCatalog(BathhouseProject bathhouseProject);

    BathhouseProject findBathhouseProjectByNumber(int number);

    List<BathhouseProject> findBathhouseProjectByBathhouseType(String bathhouseType);

    Set<BathhouseProject> deleteBathhouseProjectCatalog(BathhouseProject bathhouseProject);
}
