package constructionCompany.projects.bathhouseProject.catalog;

import constructionCompany.myExceptions.NoSuchElementException;
import constructionCompany.projects.bathhouseProject.BathhouseProject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BathhouseProjectCatalog implements IBathhouseProjectCatalog{
    private Set<BathhouseProject> bathhouseProjectSet = new HashSet<>();
    private static final BathhouseProjectCatalog BATHHOUSE_PROJECT_CATALOG= new BathhouseProjectCatalog();

    private BathhouseProjectCatalog() {
    }

    public static BathhouseProjectCatalog getBathhouseProjectCatalog() {
        return BATHHOUSE_PROJECT_CATALOG;
    }

    public Set<BathhouseProject> getBathhouseProjectSet() {
        return bathhouseProjectSet;
    }

    @Override
    public BathhouseProject addBathhouseProjectCatalog(BathhouseProject bathhouseProject) {
        bathhouseProjectSet.add(bathhouseProject);
        return bathhouseProject;
    }

    @Override
    public BathhouseProject findBathhouseProjectByNumber(int number) {
        BathhouseProject bathhouseProject = bathhouseProjectSet.stream().filter(bathhouseProject1 ->
                        bathhouseProject1.getNumber() == number).findAny()
                        .orElse(null);
        if(bathhouseProject == null) {
            throw new NoSuchElementException("There was no such bathhouse project" + number);
        }
        return bathhouseProject;
    }

    @Override
    public List<BathhouseProject> findBathhouseProjectByBathhouseType(String bathhouseType) {
        List<BathhouseProject> bathhouseProjects = bathhouseProjectSet.stream()
                .filter(bathhouseProject1 -> bathhouseProject1.getBathhouseType().equals(bathhouseType))
                .collect(Collectors.toList());
        if(bathhouseProjects == null) {
            throw new NoSuchElementException("There was no such bathhouse type" + bathhouseType);
        }
        return bathhouseProjects;
    }

    @Override
    public Set<BathhouseProject> deleteBathhouseProjectCatalog(BathhouseProject bathhouseProject) {
        if (bathhouseProjectSet.contains(bathhouseProject)) {
            bathhouseProjectSet.remove(bathhouseProject);
        } else {
            throw new NoSuchElementException("There was no bathhouse type");
        }
        return bathhouseProjectSet;
    }
}
