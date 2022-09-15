package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Student;

public class deleteStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 2;
			
			// Get Student
			System.out.println("retrive student with id: " + studentId);
			session.beginTransaction();
			Student tempStudent = session.get(Student.class, studentId);
			
			
			// delete student & commit transactions
			session.delete(tempStudent);
			System.out.println("Deleting student . . .");
			session.getTransaction().commit();
	
			//NEW CODE
			studentId=3;
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// delete by query and commit transaction
			System.out.println("Deleting student by query "+studentId+" . . .");
			session.createQuery("delete Student s where s.id ="+ studentId).executeUpdate();
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
