package main.constructionCompany.estimates.brigadeEstimate.catalog;

import main.constructionCompany.divisions.brigade.Brigade;
import main.constructionCompany.estimates.brigadeEstimate.BrigadeEstimate;

import java.util.List;
import java.util.Set;

public interface IBrigadeEstimatesCatalog {
    BrigadeEstimate addBrigadeEstimate(BrigadeEstimate brigadeEstimate);

    BrigadeEstimate findBrigadeEstimateByCode(int code);

    List<BrigadeEstimate> findByBrigade(Brigade brigade);

    Set<BrigadeEstimate> deleteBrigadeEstimate(BrigadeEstimate brigadeEstimate);
}
