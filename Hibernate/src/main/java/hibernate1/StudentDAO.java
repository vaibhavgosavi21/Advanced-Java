package hibernate1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDAO {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hibernate1");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		StudentDTO std=new StudentDTO();
		std.setRollno(3);
		std.setSname("Ram");
		std.setMarks(77.88);
		
		manager.persist(std);
		transaction.commit();
		factory.close();
		manager.close();
	}
}
