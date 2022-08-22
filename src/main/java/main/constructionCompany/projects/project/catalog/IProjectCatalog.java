package main.constructionCompany.projects.project.catalog;

import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.projects.project.Project;

import java.util.List;
import java.util.Set;

public interface IProjectCatalog {
    Project addProject(Project project);

    Project findProjectByNumber(int number);

    Project findProjectByCustomer(Customer customer);

    Set<Project> deleteProjectCatalog(Project project);

    public List<Project> toList();
}
