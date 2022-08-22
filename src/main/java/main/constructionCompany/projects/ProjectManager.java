package main.constructionCompany.projects;

import main.constructionCompany.myExceptions.ProjectNotFoundedException;
import main.constructionCompany.projects.project.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private List<Project> projectList;

    public ProjectManager(List<Project> projectList) {
        this.projectList = projectList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Project check(int number) throws ProjectNotFoundedException {
        List<Integer>NumberProjectList = new ArrayList<Integer>();
        for (Project project : this.projectList){
            NumberProjectList.add(project.getNumber());
        }
        if (!NumberProjectList.contains(number)) {
            return new Project();
        } else {
            throw new ProjectNotFoundedException(
                    "Project with this number is already used " + number);
        }
    }
}
