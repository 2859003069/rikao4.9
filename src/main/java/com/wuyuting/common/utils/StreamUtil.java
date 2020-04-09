package com.wuyuting.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {

	//方法1 批量关闭流量
	public static void colseAll(AutoCloseable ...autoCloseables) {
		//关闭的条件
		if(autoCloseables!=null) {
			autoCloseables.clone();
		}
		
	}
	
	//方法2 传入一个文件对象
	public static String readTextFile(String  filePath) throws Exception {
		InputStream inputStream=null;
		
		//inputStream =new FileInputStream(txtFile);
		
		byte[] b = new byte[1024];
		String str = "";
		//读取
		while(inputStream.read(b)!=-1) {
			str += new String(b);
		}
		
		return readTextFile(new File(filePath));
		
		
		
	}
	
		//方法3 
		
		@SuppressWarnings("resource")
		public static String readTextFile(File txtFile) throws Exception {
		
		InputStream inputStream=null;
		
		inputStream =new FileInputStream(txtFile);
		
		byte[] b = new byte[1024];
		String str = "";
		//读取
		while(inputStream.read(b)!=-1) {
			str += new String(b);
		}
		
		return str;
		
		
		
	}
	
}
