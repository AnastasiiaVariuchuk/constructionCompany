package main.constructionCompany.divisions.department.catalog.catalog;

import main.constructionCompany.divisions.department.catalog.Department;

import java.util.List;
import java.util.Set;

public interface IDepartmentCatatlog {
    Department addDepartment(Department department);

    Department findDepartmentByPhoneNumber(String phoneNumber);

    Department findDepartmentByName(String name);

    Set<Department> deleteDepartment(Department department);

    List<Department> toList();
}
