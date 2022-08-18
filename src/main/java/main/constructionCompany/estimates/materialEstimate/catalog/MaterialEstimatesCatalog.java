package main.constructionCompany.estimates.materialEstimate.catalog;

import main.constructionCompany.estimates.materialEstimate.MaterialEstimate;
import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.reserves.material.Material;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaterialEstimatesCatalog implements IMaterialEstimatesCatalog{
    private Set<MaterialEstimate> materialEstimateSet = new HashSet<>();
    private final static MaterialEstimatesCatalog MATERIAL_ESTIMATES_CATALOG = new MaterialEstimatesCatalog();

    public MaterialEstimatesCatalog(){
    }

    public Set<MaterialEstimate> getMaterialEstimateSet() {
        return materialEstimateSet;
    }

    public static MaterialEstimatesCatalog getMaterialEstimatesCatalog() {
        return MATERIAL_ESTIMATES_CATALOG;
    }

    @Override
    public MaterialEstimate addMaterialEstimate(MaterialEstimate materialEstimate) {
        materialEstimateSet.add(materialEstimate);
        return materialEstimate;
    }

    @Override
    public MaterialEstimate findMaterialEstimateByCode(int code) {
        MaterialEstimate materialEstimate = materialEstimateSet.stream().filter(e1 ->
                        e1.getCode() == code).findAny()
                .orElse(null);
        if(materialEstimate == null) {
            throw new NoSuchElementException("There was no such material estimate" + code);
        }
        return materialEstimate;
    }

    @Override
    public List<MaterialEstimate> findByMaterial(Material material) {
        List<MaterialEstimate> materialEstimates = materialEstimateSet.stream()
                .filter(e1 -> e1.getMaterial().equals(material))
                .collect(Collectors.toList());
        if(materialEstimates == null) {
            throw new NoSuchElementException("There was no such material estimates" + material);
        }
        return materialEstimates;
    }

    @Override
    public Set<MaterialEstimate> deleteMaterialEstimate(MaterialEstimate materialEstimate) {
        if (materialEstimateSet.contains(materialEstimate)) {
            materialEstimateSet.remove(materialEstimate);
        } else {
            throw new NoSuchElementException("There was no such material estimate");
        }
        return materialEstimateSet;
    }
}
