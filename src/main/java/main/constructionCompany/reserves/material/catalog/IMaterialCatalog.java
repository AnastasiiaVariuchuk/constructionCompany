package main.constructionCompany.reserves.material.catalog;

import main.constructionCompany.reserves.material.Material;

import java.util.List;
import java.util.Set;

public interface IMaterialCatalog {
    Material addMaterial(Material material);

    Material findMaterialByName(String name);

    List<Material> findMaterialByType(String type);

    Set<Material> deleteMaterial(Material material);

    public List<Material> toList();
}

