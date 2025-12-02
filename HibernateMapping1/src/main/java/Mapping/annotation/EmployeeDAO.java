package Mapping.annotation;



import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openconnection() {
		factory = Persistence.createEntityManagerFactory("HibernateMapping1");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	public static void closeconnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}
	public static void main(String[] args) {
		openconnection();
		transaction.begin();
//		EmployeeDTO emp1=new EmployeeDTO();
//		emp1.setName("Rohan");
//		emp1.setSalary(40000);
//		emp1.setLoc("Mumbai");
//		emp1.setDesignation("Data Engineer");
//		
//		manager.persist(emp1);
		
		
		//JpQa
		Query query= manager.createQuery("from EmployeeDTO");
		 List<EmployeeDTO> emps=query.getResultList();
		 emps.forEach(val->System.out.println(val.getName()+" || "+ val.getDesignation()+" || "+val.getSalary()));
		
		transaction.commit();
		closeconnection();
		
	}

}
