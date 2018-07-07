package savestudents;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import junit.hibernatetest.Student;

public class saveStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session sessionObj = factory.getCurrentSession();
		
		try {
			System.out.println("Creating new student");
			Student stu = new Student("Paul","School", "school.paul@gmail.com");
			
			sessionObj.beginTransaction();
			System.out.println("Saving student");
			sessionObj.save(stu);
			sessionObj.getTransaction().commit();
			System.out.println("Done ...");
			
		} finally {
			
			factory.close();
			
		}
		
	}
}
