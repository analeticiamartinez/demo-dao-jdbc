package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste 1: insert department");
        Department dep = new Department(null, "Musica");
        departmentDao.insert(dep);
        System.out.println("Inserido");

        System.out.println("Teste 2: findByID");
        dep = departmentDao.findById(5);
        System.out.println(dep);


        System.out.println("Teste 3: update department");
        dep = departmentDao.findById(5);
        dep.setName("musica2");
        departmentDao.update(dep);
        System.out.println("Updated");

        System.out.println("Teste 4: delete department");
        departmentDao.deleteById(8);
        System.out.println("deleted");


        System.out.println("Teste 5: findAll");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) System.out.println(obj);

    }
}
