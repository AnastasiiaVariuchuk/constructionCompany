package main.constructionCompany.divisions.department.catalog.catalog;

import main.constructionCompany.divisions.department.catalog.Department;
import main.constructionCompany.myExceptions.NoSuchElementException;

import java.util.HashSet;
import java.util.Set;

public class DepartmentCatalog implements IDepartmentCatatlog {
    private Set<Department> departmentSet = new HashSet<>();
    private static final DepartmentCatalog DEPARTMENT_CATALOG = new DepartmentCatalog();

    public DepartmentCatalog(){
    }

    public static DepartmentCatalog getDepartmentCatalog() {
        return DEPARTMENT_CATALOG;
    }

    public Set<Department> getDepartmentSet() {
        return departmentSet;
    }

    @Override
    public Department addDepartment(Department department) {
        departmentSet.add(department);
        return department;
    }

    @Override
    public Department findDepartmentByPhoneNumber(String phoneNumber) {
        Department department = departmentSet.stream().filter(department1 -> department1.getPhoneNumber().equals(phoneNumber)).findAny()
                .orElse(null);
        if(department == null) {
            throw new NoSuchElementException("There was no such department" + phoneNumber);
        }
        return department;
    }

    @Override
    public Department findDepartmentByName(String name) {
        Department department = departmentSet.stream().filter(department1 -> department1.getName().equals(name)).findAny()
                .orElse(null);
        if(department == null) {
            throw new NoSuchElementException("There was no such department" + name);
        }
        return department;
    }

    @Override
    public Set<Department> deleteDepartment(Department department) {
        if (departmentSet.contains(department)) {
            departmentSet.remove(department);
        } else {
            throw new NoSuchElementException("There was no such department");
        }
        return departmentSet;
    }
}
