package main.constructionCompany.estimates.estimate.catalog;

import main.constructionCompany.estimates.estimate.Estimate;
import main.constructionCompany.myExceptions.NoSuchElementException;

import java.util.HashSet;
import java.util.Set;

public class EstimatesCatalog implements IEstimatesCatalog {
    private Set<Estimate>  estimateSet = new HashSet<>();

    private static final EstimatesCatalog ESTIMATES_CATALOG = new EstimatesCatalog();

    private EstimatesCatalog() {
    }

    public static EstimatesCatalog getEstimatesCatalog() {
        return ESTIMATES_CATALOG;
    }

    public Set<Estimate> getEstimateSet() {
        return estimateSet;
    }

    @Override
    public Estimate addEstimate(Estimate estimate) {
        estimateSet.add(estimate);
        return estimate;
    }

    @Override
    public Estimate findEstimateByCode(int code) {
        Estimate estimate = estimateSet.stream().filter(e1 ->
                        e1.getCode() == code).findAny()
                .orElse(null);
        if(estimate == null) {
            throw new NoSuchElementException("There was no such estimate" + code);
        }
        return estimate;
    }

    @Override
    public Set<Estimate> deleteEstimate(Estimate estimate) {
        if (estimateSet.contains(estimate)) {
            estimateSet.remove(estimate);
        } else {
            throw new NoSuchElementException("There was no such estimate");
        }
        return estimateSet;
    }
}
