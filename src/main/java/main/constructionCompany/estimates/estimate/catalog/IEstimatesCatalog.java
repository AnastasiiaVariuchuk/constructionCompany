package main.constructionCompany.estimates.estimate.catalog;

import main.constructionCompany.estimates.estimate.Estimate;

import java.util.List;
import java.util.Set;

public interface IEstimatesCatalog {
    Estimate addEstimate(Estimate estimate);

    Estimate findEstimateByCode(int code);

    Set<Estimate> deleteEstimate(Estimate estimate);

    List<Estimate> toList();
}
