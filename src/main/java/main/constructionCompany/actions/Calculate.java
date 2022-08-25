package main.constructionCompany.actions;

import main.constructionCompany.estimates.brigadeEstimate.BrigadeEstimate;
import main.constructionCompany.estimates.estimate.Estimate;
import main.constructionCompany.estimates.materialEstimate.MaterialEstimate;
import main.constructionCompany.projects.project.Project;

public class Calculate {
    public static double getPrice(Project project) {
        double price = 0;
        for (Estimate estimate : project.getEstimates()) {
            for (BrigadeEstimate brigadeEstimate : estimate.getBrigadeEstimates()) {
                price += brigadeEstimate.getPrice();
            }
            for (MaterialEstimate materialEstimate : estimate.getMaterialEstimates()) {
                price += materialEstimate.getPrice();
            }
            price += estimate.getPrice();
        }
        return price;
    }
}
