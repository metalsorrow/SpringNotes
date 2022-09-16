package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Course;
import com.lov2code.hibernate.demo.entity.Instructor;
import com.lov2code.hibernate.demo.entity.InstructorDetail;
import com.lov2code.hibernate.demo.entity.Student;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Instructor.class)
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Course.class)
								 .buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// get the instructor from db
			int theId=2;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			// create courses
			Course tempCourse1 = new Course("Java Course");
			Course tempCourse2 = new Course("Python Course");
	
			// associate the objects
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			
			//save courses
			// this also save details object because of cascadetype.ALL
			System.out.println("Saving instructor Courses: "+tempInstructor.toString());
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// commit transaction
			session.getTransaction().commit();

	
			// Confirm success
			System.out.println("Done!");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

}
