package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Course;
import com.lov2code.hibernate.demo.entity.Instructor;
import com.lov2code.hibernate.demo.entity.InstructorDetail;
import com.lov2code.hibernate.demo.entity.Review;
import com.lov2code.hibernate.demo.entity.Student;

public class AddCourseForMaryDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Instructor.class)
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Course.class)
								 .addAnnotatedClass(Student.class)
								 .addAnnotatedClass(Review.class)
								 .buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// get the student mary from database
			int theId = 2;
			Student tempStudent = session.get(Student.class, theId);
			System.out.println("Loaded student: "+ tempStudent);
			System.out.println("Courses: "+tempStudent.getCourses());
			
			// create more courses
			Course tempCourse1 = new Course("Guitar lessons");
			Course tempCourse2 = new Course("Rubiks cube");
			
			// add student to courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			// save the courses
			System.out.println("\nSaving the courses . . .");
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

}
