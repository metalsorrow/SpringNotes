package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			System.out.println("List of Studens: \n");
			displayStudent(theStudents);
			
			// query students : lastName='Lee'
			
			theStudents = session.createQuery("from Student s where s.lastName='Lee'").getResultList();
			
			// display the query
			System.out.println("List of Studens filtered: \n");
			displayStudent(theStudents);
			
			// query students: lastName='Lee' Or firstName='Juan'
			theStudents = session.createQuery("from Student s where s.lastName='Lee' OR s.firstName='Juan'").getResultList();
			System.out.println("List of Studens filtered with OR: \n");
			displayStudent(theStudents);
			
			// query students where email Like '%luv2code.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();
			System.out.println("List of Studens filtered with like: \n");
			displayStudent(theStudents);
		
			
			// commit transaction
			session.getTransaction().commit();
			
			// Confirm success
			System.out.println("Done!");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

	private static void displayStudent(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent.toString());
		}
	}

}
