package savestudents;

import java.util.List;

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
			
			
			sessionObj.beginTransaction();
			
			List<Student> theStudent = sessionObj.createQuery("from Student").getResultList();		
			
			
			System.out.println("Select all student");
			System.out.println("==================================");
			
			System.out.println(theStudent.size());

			for (Student student : theStudent) {
				System.out.println("=========== First Name ===========");
				System.out.println(student.toString());
				System.out.println("===============");
			}
			System.out.println("Done ...");
			sessionObj.getTransaction().commit();
		} finally {
			
			factory.close();
			
		}
		
	}

}
