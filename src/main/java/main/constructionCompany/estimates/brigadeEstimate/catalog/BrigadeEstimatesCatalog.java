package main.constructionCompany.estimates.brigadeEstimate.catalog;

import main.constructionCompany.divisions.brigade.Brigade;
import main.constructionCompany.estimates.brigadeEstimate.BrigadeEstimate;
import main.constructionCompany.myExceptions.NoSuchElementException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BrigadeEstimatesCatalog implements IBrigadeEstimatesCatalog {
    private Set<BrigadeEstimate> brigadeEstimateSet = new HashSet<>();
    private final static BrigadeEstimatesCatalog BRIGADE_ESTIMATES_CATALOG = new BrigadeEstimatesCatalog();

    public BrigadeEstimatesCatalog(){
    }

    public Set<BrigadeEstimate> getBrigadeEstimateSet() {
        return brigadeEstimateSet;
    }

    public static BrigadeEstimatesCatalog getMaterialEstimatesCatalog() {
        return BRIGADE_ESTIMATES_CATALOG;
    }

    @Override
    public BrigadeEstimate addBrigadeEstimate(BrigadeEstimate brigadeEstimate) {
        brigadeEstimateSet.add(brigadeEstimate);
        return brigadeEstimate;
    }

    @Override
    public BrigadeEstimate findBrigadeEstimateByCode(int code) {
        BrigadeEstimate brigadeEstimate = brigadeEstimateSet.stream().filter(e1 ->
                        e1.getCode() == code).findAny()
                .orElse(null);
        if(brigadeEstimate == null) {
            throw new NoSuchElementException("There was no such brigade estimate" + code);
        }
        return brigadeEstimate;
    }

    @Override
    public List<BrigadeEstimate> findByBrigade(Brigade brigade) {
        List<BrigadeEstimate> brigadeEstimates = brigadeEstimateSet.stream()
                .filter(e1 -> e1.getBrigade().equals(brigade))
                .collect(Collectors.toList());
        if(brigadeEstimates == null) {
            throw new NoSuchElementException("There was no such brigade estimates" + brigade);
        }
        return brigadeEstimates;
    }

    @Override
    public Set<BrigadeEstimate> deleteBrigadeEstimate(BrigadeEstimate brigadeEstimate) {
        if (brigadeEstimateSet.contains(brigadeEstimate)) {
            brigadeEstimateSet.remove(brigadeEstimate);
        } else {
            throw new NoSuchElementException("There was no such brigade estimate");
        }
        return brigadeEstimateSet;
    }
}
