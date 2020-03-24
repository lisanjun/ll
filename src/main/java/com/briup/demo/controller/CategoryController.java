package com.briup.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.Article;
import com.briup.demo.bean.Category;
import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.service.ICategoryService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;
import com.briup.demo.utils.StatusCodeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="栏目相关")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	/**
	 * 查询所有栏目信息
	 * 
	 * */
	@GetMapping("/getAllCategory")
	@ApiOperation("获取所有的栏目信息")
	public Message<List<Category>> findAllCategorys(){
		return MessageUtil.success(categoryService.findAllCategorys());
		
	}
	
	
	/**
	 * 新增栏目信息
	 * 
	 * */
	@GetMapping("/saveCategory")
	@ApiOperation("新增栏目")
	public Message<String> saveCategory(Category category){
		try {
			categoryService.saveOrUpdateCategory(category);
			return MessageUtil.success();
		} catch (CustomerException e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误"+e.getMessage());
		}
	}
	
	/**
	 * 保存栏目信息
	 * 
	 * */
	@GetMapping("/updateCategory")
	@ApiOperation("新增栏目")
	public Message<String> updateCategory(Category category){
		try {
			categoryService.saveOrUpdateCategory(category);
			return MessageUtil.success();
		} catch (CustomerException e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误"+e.getMessage());
		}
	}
	
	/**
	 * 删除栏目信息
	 * 根据id
	 * */
	
	@GetMapping("/deleteCategory")
	@ApiOperation("根据id删除栏目信息")
	public Message<String> deletCategory(int id){
		categoryService.deleteCategoryById(id);
		return MessageUtil.success();
	}
	
	/**
	 * 查找栏目信息
	 * 根据id
	 * */
	
	@GetMapping("/findCategoryById")
	@ApiOperation("根据id查找栏目信息")
	public Message<Category> findCategoryById(int id){
		categoryService.deleteCategoryById(id);
		return MessageUtil.success(categoryService.findCategoryById(id));
	}
	
	@GetMapping("/findCategoryExById")
	@ApiOperation("根据栏目ID查找栏目及其包含所有文章信息")
	public Message<CategoryEx> findCategoryExById(int id){
		
		return MessageUtil.success(categoryService.findCategoryExById(id));
	}
	
	
}
