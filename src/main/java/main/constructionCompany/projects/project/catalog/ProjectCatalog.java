package main.constructionCompany.projects.project.catalog;

import main.constructionCompany.myExceptions.NoSuchElementException;
import main.constructionCompany.people.customer.Customer;
import main.constructionCompany.projects.project.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProjectCatalog implements IProjectCatalog{
    private Set<Project> projectSet = new HashSet<>();

    private static final ProjectCatalog PROJECT_CATALOG= new ProjectCatalog();

    public ProjectCatalog() {
    }

    public static ProjectCatalog getProjectCatalog() {
        return PROJECT_CATALOG;
    }

    public Set<Project> getProjectSet() {
        return projectSet;
    }

    @Override
    public Project addProject(Project project) {
        projectSet.add(project);
        return project;
    }

    @Override
    public Project findProjectByNumber(int number) {
        Project project = projectSet.stream().filter(project1 ->
                        project1.getNumber() == number).findAny()
                .orElse(null);
        if(project == null) {
            throw new NoSuchElementException("There was no such project" + number);
        }
        return project;
    }

    @Override
    public Project findProjectByCustomer(Customer customer) {
        Project project = projectSet.stream().filter(project1 ->
                        project1.getCustomer() == customer).findAny()
                .orElse(null);
        if(project == null) {
            throw new NoSuchElementException("There was no such project" + customer);
        }
        return project;
    }

    @Override
    public Set<Project> deleteProjectCatalog(Project project) {
        if (projectSet.contains(project)) {
            projectSet.remove(project);
        } else {
            throw new NoSuchElementException("There was no project");
        }
        return projectSet;
    }

    @Override
    public List<Project> toList() {
        List<Project> list = new ArrayList<>();
        for (Project element : projectSet) {
            list.add(element);
        }
        return list;
    }
}
