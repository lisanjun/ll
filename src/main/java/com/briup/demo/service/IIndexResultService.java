package com.briup.demo.service;

import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.bean.ex.IndexResult;
import com.briup.demo.utils.CustomerException;

/**
 * 首页数据管理的Service层接口
 *  
 * */

public interface IIndexResultService {
	
	/**
	 * 查询首页需要的数据
	 * 
	 * */
	IndexResult findIndexAllResult() throws CustomerException;
	

}
