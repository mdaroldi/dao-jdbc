package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Teste 4: seller insert ===");
		Department dep = new Department(null, "Apparel");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());

	}

}
