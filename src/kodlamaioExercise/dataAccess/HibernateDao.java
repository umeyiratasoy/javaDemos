package kodlamaioExercise.dataAccess;

import kodlamaioExercise.entities.Category;
import kodlamaioExercise.entities.Course;
import kodlamaioExercise.entities.Instructor;

public class HibernateDao implements CategoryDao, InstructorDao, CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course Hibernate with added");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Hibernate with added");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Category Hibernate with added");
		
	}

}
