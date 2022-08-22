package main.constructionCompany.projects.houseProject.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.projects.houseProject.HouseProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HouseProjectCatalog implements IHouseProjectCatalog{
    private Set<HouseProject> houseProjectSet = new HashSet<>();
    private static final HouseProjectCatalog HOUSE_PROJECT_CATALOG= new HouseProjectCatalog();

    private HouseProjectCatalog() {
    }

    public static HouseProjectCatalog getHouseProjectCatalog() {
        return HOUSE_PROJECT_CATALOG;
    }

    public Set<HouseProject> getHouseProjectSet() {
        return houseProjectSet;
    }

    @Override
    public HouseProject addHouseProjectCatalog(HouseProject houseProject) {
        houseProjectSet.add(houseProject);
        return houseProject;
    }

    @Override
    public HouseProject findHouseProjectByNumber(int number) {
        HouseProject project = houseProjectSet.stream().filter(houseProject1 ->
                        houseProject1.getNumber() == number).findAny()
                .orElse(null);
        if(project == null) {
            throw new NoSuchElementException("There was no such house project" + number);
        }
        return project;
    }

    @Override
    public List<HouseProject> findHouseProjectByFamilySize(String familySize) {
        List<HouseProject> projects = houseProjectSet.stream()
                .filter(houseProject1 -> houseProject1.getFamilySize().equals(familySize))
                .collect(Collectors.toList());
        if(projects == null) {
            throw new NoSuchElementException("There was no such house type" + familySize);
        }
        return projects;
    }

    @Override
    public Set<HouseProject> deleteHouseProjectCatalog(HouseProject houseProject) {
        if (houseProjectSet.contains(houseProject)) {
            houseProjectSet.remove(houseProject);
        } else {
            throw new NoSuchElementException("There was no house");
        }
        return houseProjectSet;
    }

    public List<HouseProject> toList() {
        List<HouseProject> list = new ArrayList<>();
        for (HouseProject element : houseProjectSet) {
            list.add(element);
        }
        return list;
    }
}
