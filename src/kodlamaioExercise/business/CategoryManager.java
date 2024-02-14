package kodlamaioExercise.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioExercise.core.logging.Logger;
import kodlamaioExercise.dataAccess.CategoryDao;
import kodlamaioExercise.entities.Category;

public class CategoryManager {
	CategoryDao categoryDao;
	Logger[] loggers;

	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}



	List<String> categories = new ArrayList<>();

	

	public void add(Category category) throws Exception {
        if (categories.contains(category.getName())){
            throw new Exception("This category already exist: " + category.getName());
        }
        else {
            categories.add(category.getName());
            categoryDao.add(category);
    		for (Logger logger : loggers) { 
    			logger.Log(category.getName());
    		}
        }
	}
	
	
	
}
