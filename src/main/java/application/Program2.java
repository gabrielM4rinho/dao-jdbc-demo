package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Teste 1: Department Insert===");
        Department newDepartment = new Department(null, "Tools");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== Teste 2: Department findById===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== Teste 3: Department Update===");
        department = departmentDao.findById(6);
        department.setName("Cars");
        departmentDao.update(department);
        System.out.println("Update completed");


    }
}
