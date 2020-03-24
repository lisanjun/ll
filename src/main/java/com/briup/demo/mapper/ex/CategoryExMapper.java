package com.briup.demo.mapper.ex;

import java.util.List;

import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.utils.CustomerException;

/**
 * 查询栏目及其包含的文章信息
 * */
public interface CategoryExMapper {
	/**
	 * 实现查询所有栏目及其包含的文章信息
	 * @return
	 * */
	List<CategoryEx> findAllCategoryExs() throws CustomerException;
	
	/**
	 * 查询通过id查询对应栏目及其包含的文章信息
	 * */
	CategoryEx findCategoruExById(int id);
	
}
