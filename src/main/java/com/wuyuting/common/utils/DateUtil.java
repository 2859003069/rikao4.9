package com.wuyuting.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	//方法1
	public static Date getDateByInitMonth(Date src) throws Exception {
		//创建一个时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String string = format.format(new Date());
		System.out.println("string=="+string);
		//新的日期
		String s = string.substring(0, 10)+"00:00:00";
		
		//打印输出
		System.out.println("s="+ s);
		
		//转成成为正确的日期
		
		return format.parse(s);
		
	}
	//方法2
	public static Date getDateByFullMonth(Date src) throws Exception {
		//创建一个时间
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String string = format.format(new Date());
				System.out.println("string=="+string);
				//新的日期
				String s1 = string.substring(0, 10)+"23:59:59";
				
				//打印输出
				System.out.println("s1="+ s1);
				
				//转成成为正确的日期
				
				return format.parse(s1);
		
		
	}
	
}
