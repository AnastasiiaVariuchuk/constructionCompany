package main.constructionCompany.estimates.materialEstimate.catalog;

import main.constructionCompany.estimates.materialEstimate.MaterialEstimate;
import main.constructionCompany.reserves.material.Material;

import java.util.List;
import java.util.Set;

public interface IMaterialEstimatesCatalog {
    MaterialEstimate addMaterialEstimate(MaterialEstimate materialEstimate);

    MaterialEstimate findMaterialEstimateByCode(int code);

    List<MaterialEstimate> findByMaterial(Material material);

    Set<MaterialEstimate> deleteMaterialEstimate(MaterialEstimate materialEstimate);
}
