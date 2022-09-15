package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.demo.entity.Employee;

public class ActivityHibernate {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Employee.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// charge employees
			Employee myEmployee = new Employee( "Admin", "Sudo", "internat");
			Employee myEmployee2 = new Employee( "Jose", "Ramirez", "internat");
			Employee myEmployee3= new Employee( "Dan", "Arebal", "internat");
			
			session.beginTransaction();
			
			session.save(myEmployee);
			session.save(myEmployee2);
			session.save(myEmployee3);
			
			session.getTransaction().commit();
			System.out.println("Saved Employees!!" );
			
			// Retrieve user by id
			int id = 1;
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Employee myAdmin = session.get(Employee.class, id);
			
			System.out.println("Retrieved Employee: " + myAdmin.toString());
			
			session.getTransaction().commit();
			
			// search employees by company given 
			String searchedCompany = "internat";
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			List<Employee> employees = session.createQuery("from Employee e where e.company ='"+searchedCompany+"'").getResultList();
			session.getTransaction().commit();
			
			
			System.out.println("List of Employees");
			for(Employee tempEmployee : employees) {
				System.out.println("Employee: "+tempEmployee.toString());
			}
			
			//Delete employee by id
			int idToDelete = 1;
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("delete from Employee e where e.id="+idToDelete).executeUpdate();
			session.getTransaction().commit();
			System.out.println("Employee id:"+idToDelete+" Deleted successfully");
			
			
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sessionFactory.close();
		}

	}

}
