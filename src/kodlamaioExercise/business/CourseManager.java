package kodlamaioExercise.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioExercise.core.logging.Logger;
import kodlamaioExercise.dataAccess.CourseDao;
import kodlamaioExercise.entities.Course;

public class CourseManager {
	CourseDao courseDao;
	Logger[] loggers;
	
	
	List<String> courses = new ArrayList<>();
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}




	public void add(Course course) throws Exception {
		if (courses.contains(course.getName()) || course.getUnitPrice() < 0 ) {
			throw new Exception("This course already exist: " + course.getName() + " or " + "The price of course cannot be lower than 0(zero): " + course.getName());
		}
        courses.add(course.getName());
        courseDao.add(course);
		for (Logger logger : loggers) { 
			logger.Log(course.getName());
		}
		
	}
	
}
