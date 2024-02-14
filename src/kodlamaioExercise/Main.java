package kodlamaioExercise;

import java.util.ArrayList;
import java.util.List;

import kodlamaioExercise.business.CategoryManager;
import kodlamaioExercise.business.CourseManager;
import kodlamaioExercise.core.logging.DatabaseLogger;
import kodlamaioExercise.core.logging.FileLogger;
import kodlamaioExercise.core.logging.Logger;
import kodlamaioExercise.core.logging.MailLogger;
import kodlamaioExercise.dataAccess.HibernateDao;
import kodlamaioExercise.dataAccess.JbdcDao;
import kodlamaioExercise.entities.Category;
import kodlamaioExercise.entities.Course;

public class Main {

	
	

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger() };
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programming");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Machine");
		
		System.out.println("Jbdc");
		CategoryManager categoryManager = new CategoryManager(new JbdcDao(), loggers);
		categoryManager.add(category);
		// categoryManager.add(category1);
		
		System.out.println("Hibernate");
		CategoryManager categoryManager1 = new CategoryManager(new HibernateDao(), loggers);
		categoryManager1.add(category);
		// categoryManager.add(category1);
		
		System.out.println("----------------------------------------------------");
		
		Course course = new Course();
		course.setId(1);
		course.setName("c#");
		course.setUnitPrice(1.20);
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("java");
		course1.setUnitPrice(2);
		
		System.out.println("Jbdc");
		CourseManager courseManager = new CourseManager(new JbdcDao(), loggers);
		courseManager.add(course);
		//courseManager.add(course1);
		
		System.out.println("Hibernate");
		CourseManager courseManager1 = new CourseManager(new HibernateDao(), loggers);
		courseManager1.add(course);
		//courseManager.add(course1);
		
	}

}
