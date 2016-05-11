package com.gxp.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxp.service.FooService;

/**
 * <p>
 * Project Name: 超级促销王
 * <br>
 * Description: 
 * <br>
 * File Name: FooServiceImpl.java
 * <br>
 * Copyright: Copyright (C) 2009 All Rights Reserved.
 * <br>
 * Company: 杭州迅博达数字传媒技术有限公司
 * <br>
 * @author 葛晓鹏
 * @create time：2016年5月11日 下午3:03:53
 * @version: v2.1
 * 
 *       Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2016年5月11日 下午3:03:53 |葛晓鹏    　　|v2.1        |Create
 * 
 */
public class FooServiceImpl implements FooService{
	public String hello(String name){
		 return "hello " + name;
	}
	

}
