package com;
import java.net.*;
import java.io.*;
import java.util.*;
public class Demo1 {

	/**
	 * @param args
	 * 获取 URL 响应头信息
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			URL url = new URL("https://www.baidu.com/");
			URLConnection con = url.openConnection();
			Map<String,List<String>> headers = con.getHeaderFields();
			for(Map.Entry<String, List<String>> ele : headers.entrySet()){
				System.out.println(ele.getKey() + ":" + ele.getValue());
			}
		}catch(Exception e){
			
		}
	}

}
