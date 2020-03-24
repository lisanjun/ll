package com.briup.demo.service;

import java.util.List;

import com.briup.demo.bean.Article;
import com.briup.demo.bean.Category;
import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.utils.CustomerException;

public interface ICategoryService {
	
	/**
	 * 查询所有栏目
	 * */
	
	public List<Category> findAllCategorys() throws CustomerException;
	
	/**
	 * 添加或删除栏目信息
	 * */
	public void saveOrUpdateCategory(Category category) throws CustomerException;
	/**
	 * 根据id删除对应栏目信息
	 * */
	public void deleteCategoryById(int id) throws CustomerException;
	
	/**
	 * 根据id查找指定的栏目信息
	 * */
	public Category findCategoryById(int id)  throws CustomerException;
	
	/**
	 * 查询栏目信息并级联查询包含文章信息
	 */
	List<CategoryEx> findAllCategoryEx() throws CustomerException;
	
	/**
	 * 通过栏目名字查询该栏目下面的所有文章信息
	 * */
	// List<Article> findCategoryByName() throws CustomerException;
	
	/**
	 * 查询栏目以及其包含的文章的所有信息
	 * 
	 * */
	CategoryEx findCategoryExById(int id) throws CustomerException;
	
}
