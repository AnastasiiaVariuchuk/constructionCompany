package constructionCompany.divisions.department.catalog.catalog;

import constructionCompany.divisions.department.catalog.Department;

import java.util.Set;

public interface IDepartmentCatatlog {
    Department addDepartment(Department department);

    Department findDepartmentByPhoneNumber(String phoneNumber);

    Department findDepartmentByName(String name);

    Set<Department> deleteDepartment(Department department);
}
