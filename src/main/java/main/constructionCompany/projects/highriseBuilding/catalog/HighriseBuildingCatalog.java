package main.constructionCompany.projects.highriseBuilding.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.projects.highriseBuilding.HighriseBuilding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HighriseBuildingCatalog implements IHighriseBuildingCatalog{
    private Set<HighriseBuilding> highriseBuildings = new HashSet<>();
    private static final HighriseBuildingCatalog HIGHRISE_BUILDING_CATALOG = new HighriseBuildingCatalog();

    private HighriseBuildingCatalog() {
    }

    public static HighriseBuildingCatalog getHighriseBuildingCatalog() {
        return HIGHRISE_BUILDING_CATALOG;
    }

    public Set<HighriseBuilding> getHighriseBuildings() {
        return highriseBuildings;
    }

    @Override
    public HighriseBuilding addHighriseBuilding(HighriseBuilding highriseBuilding) {
        highriseBuildings.add(highriseBuilding);
        return highriseBuilding;
    }

    @Override
    public HighriseBuilding findHighriseBuildingByNumber(int number) {
        HighriseBuilding project =highriseBuildings.stream().filter(houseProject1 ->
                        houseProject1.getNumber() == number).findAny()
                .orElse(null);
        if(project == null) {
            throw new NoSuchElementException("There was no such project" + number);
        }
        return project;
    }

    @Override
    public List<HighriseBuilding> findHighriseBuildingByUsageType(String usageType) {
        List<HighriseBuilding> projects = highriseBuildings.stream()
                .filter(highriseBuilding1 -> highriseBuilding1.getUsageType().equals(usageType))
                .collect(Collectors.toList());
        if(projects == null) {
            throw new NoSuchElementException("There was no such type" + usageType);
        }
        return projects;
    }

    @Override
    public Set<HighriseBuilding> deleteHighriseBuildingCatalog(HighriseBuilding highriseBuilding) {
        if (highriseBuildings.contains(highriseBuilding)) {
            highriseBuildings.remove(highriseBuilding);
        } else {
            throw new NoSuchElementException("There was no such type");
        }
        return highriseBuildings;
    }
}
