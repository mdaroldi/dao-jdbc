package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: department insert ===");
		Department dep = new Department(null, "Apparel");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== Teste 2: department delete ===");
		departmentDao.deleteById(7);
		System.out.println("Delete completed");
		
		System.out.println("\n=== Teste 3: department findById ===");
		dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== Teste 4: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

	}

}
