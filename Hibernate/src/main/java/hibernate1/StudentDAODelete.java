package hibernate1;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDAODelete {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate1");//project name
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
		Scanner sc=new Scanner(System.in);
		openConnection();
		transaction.begin();
		System.out.println("Enter id to delete: ");
		int id=sc.nextInt();
		StudentDTO student=manager.find(StudentDTO.class,id );
		manager.remove(student);
		System.out.println("Removed");
		transaction.commit();
		closeConnection();
	}

}
