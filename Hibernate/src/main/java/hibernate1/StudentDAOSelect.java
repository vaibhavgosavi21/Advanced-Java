package hibernate1;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDAOSelect {

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
		transaction.begin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id: ");
		int rollno=sc.nextInt();
		StudentDTO student=manager.find(StudentDTO.class, rollno);
		System.out.println();
		System.out.println(student);
		transaction.commit();
		closeConnection();
		
	}
}
