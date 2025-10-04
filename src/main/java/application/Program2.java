package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n=== Teste 4: Department Delete===");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete complete");
        sc.close();

        System.out.println("\n=== Teste 5: findAll===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

    }
}
