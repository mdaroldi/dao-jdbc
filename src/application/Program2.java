package application;

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
		departmentDao.deleteById(6);
		System.out.println("Delete completed");

	}

}
