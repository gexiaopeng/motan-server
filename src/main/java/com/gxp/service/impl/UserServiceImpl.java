package com.gxp.service.impl;

import com.gxp.service.UserService;

/**
 * <p>
 * Project Name: 超级促销王
 * <br>
 * Description: 
 * <br>
 * File Name: UserServiceImpl.java
 * <br>
 * Copyright: Copyright (C) 2009 All Rights Reserved.
 * <br>
 * Company: 杭州迅博达数字传媒技术有限公司
 * <br>
 * @author 葛晓鹏
 * @create time：2016年5月11日 下午4:11:58
 * @version: v2.1
 * 
 *       Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2016年5月11日 下午4:11:58 |葛晓鹏    　　|v2.1        |Create
 * 
 */
public class UserServiceImpl implements UserService{
	public String getUserName(int id){
		return "userId:"+id;
	}
}
