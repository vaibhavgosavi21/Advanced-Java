package Mapping1.Mapping1.OneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CarDriverDAO {

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
		
		DriverDTO driver=new DriverDTO(2, "Vaibhav", 57863463, "Mumbai");
		manager.persist(driver);
		CarDTO car=new CarDTO(1, "BMW", 4,"Black", driver);
		manager.persist(car);
		
		transaction.commit();
		closeconnection();
	}

}
