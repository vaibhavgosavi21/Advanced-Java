package hibernate1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StuedentDTOInsert {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate1");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	public static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		openConnection();
		
	}

}
