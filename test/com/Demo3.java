package com;
import java.io.*;
import java.net.*;
public class Demo3 {

	/**
	 * @param args
	 * 抓取一个网页
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		try{
			URL url = new URL("https://www.baidu.com/");
			BufferedReader reader = new BufferedReader
					(new InputStreamReader(url.openStream()));
			
			while((line = reader.readLine())  != null){
				System.out.println(line);
				
			}
			reader.close();
		}catch( Exception e){
			
		}

	}

}
