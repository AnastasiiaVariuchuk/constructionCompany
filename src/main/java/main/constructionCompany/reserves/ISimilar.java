package main.constructionCompany.reserves;

import main.constructionCompany.reserves.material.Material;

public interface ISimilar {
    boolean isSimilarType(Material material);
    boolean isSimilarMaterial(Material material);
}
