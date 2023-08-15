package com.TechTainment.services;

import java.util.List;

import com.TechTainment.entities.Category;

public interface CategoryService {
	Category createCategory(Category category);
	Category updateCategory(Category category,Integer id);
	void deleteCategory(Integer id);
	Category getCategoryById(Integer id);
	List<Category> getAllCategories();
}
