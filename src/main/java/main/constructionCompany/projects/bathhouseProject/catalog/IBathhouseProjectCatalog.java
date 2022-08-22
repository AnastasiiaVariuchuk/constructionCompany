package main.constructionCompany.projects.bathhouseProject.catalog;

import main.constructionCompany.projects.bathhouseProject.BathhouseProject;

import java.util.List;
import java.util.Set;

public interface IBathhouseProjectCatalog {
    BathhouseProject addBathhouseProject(BathhouseProject bathhouseProject);

    BathhouseProject findBathhouseProjectByNumber(int number);

    List<BathhouseProject> findBathhouseProjectByBathhouseType(String bathhouseType);

    Set<BathhouseProject> deleteBathhouseProjectCatalog(BathhouseProject bathhouseProject);

    public List<BathhouseProject> toList();
}
