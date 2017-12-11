package com;
import java.net.*;
import java.util.*;

public class Demo5 {

	/**
	 * @param args
	 * 获取 URL响应头的日期信息
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			URL url = new URL("http://www.baidu.com/");
			HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
			long date = httpCon.getDate();
			System.out.println(new Date(date));
		}catch(Exception e){
			
		}	
	}

}
