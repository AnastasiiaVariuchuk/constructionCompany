package main.constructionCompany.reserves.technique.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.reserves.technique.Technique;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TechniqueCatalog implements ITechniqueCatalog {
    private Set<Technique> techniqueSet = new HashSet<>();
    private static final TechniqueCatalog TECHNIQUE_CATALOG = new TechniqueCatalog();

    public TechniqueCatalog(){
    }

    public static TechniqueCatalog getTechniqueCatalog() {
        return TECHNIQUE_CATALOG;
    }

    public Set<Technique> getTechniqueSet() {
        return techniqueSet;
    }

    @Override
    public Technique addTechnique(Technique technique) {
        techniqueSet.add(technique);
        return technique;
    }

    @Override
    public Technique findTechniqueByNameModel(String nameModel) {
        Technique technique = techniqueSet.stream().filter(technique1 -> technique1.getNameModel().equals(nameModel)).findAny()
                .orElse(null);
        if(technique == null) {
            throw new NoSuchElementException("There was no such technique" + nameModel);
        }
        return technique;
    }

    @Override
    public List<Technique> findEmployeeByType(String type) {
        List<Technique> techniques = techniqueSet.stream()
                .filter(technique1 -> technique1.getType().equals(type))
                .collect(Collectors.toList());
        if(techniques == null) {
            throw new NoSuchElementException("There was no such technique" + techniques);
        }
        return techniques;
    }

    @Override
    public Set<Technique> deleteTechnique(Technique technique) {
        if (techniqueSet.contains(technique)) {
            techniqueSet.remove(technique);
        } else {
            throw new NoSuchElementException("There was no such technique");
        }
        return techniqueSet;
    }

    @Override
    public List<Technique> tiList() {
        List<Technique> techniques = techniqueSet.stream().collect(Collectors.toList());
        if(techniques == null) {
            throw new NoSuchElementException("There was no such technique" + techniques);
        }
        return techniques;
    }

}
