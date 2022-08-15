package constructionCompany.reserves.material.catalog;

import constructionCompany.reserves.material.Material;

import java.util.List;
import java.util.Set;

public interface IMaterialCatalog {
    Material addMaterial(Material material);

    Material findMaterialByName(String name);

    List<Material> findMaterialByType(String type);

    Set<Material> deleteMaterial(Material material);
}

