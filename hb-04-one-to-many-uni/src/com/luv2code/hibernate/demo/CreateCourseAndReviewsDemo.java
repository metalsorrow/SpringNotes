package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Course;
import com.lov2code.hibernate.demo.entity.Instructor;
import com.lov2code.hibernate.demo.entity.InstructorDetail;
import com.lov2code.hibernate.demo.entity.Review;
import com.lov2code.hibernate.demo.entity.Student;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Instructor.class)
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Course.class)
								 .addAnnotatedClass(Review.class)
								 .buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();
			
			// create a course
			Course tempCourse = new Course("PHP zero to Ninja");
			
			// add some reviews
			tempCourse.addReview(new Review("Good Course!!"));
			tempCourse.addReview(new Review("Nice Job!!"));
			tempCourse.addReview(new Review("Well Done!!"));
			
			
			// save the course ... and leverage the cascade all 
			System.out.println("Saving the course");
			System.out.println(tempCourse.toString());
			System.out.println(tempCourse.getReviews());
			session.save(tempCourse);
			
			
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
