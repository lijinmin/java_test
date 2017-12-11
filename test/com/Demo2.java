package com;
import java.io.*;
public class Demo2 {

	/**
	 * @param args
	 * 往lala.txt文件里写入内容/读入内容 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedWriter writer = new BufferedWriter
					(new FileWriter("lala.txt"));
			writer.write("lakdfaeredsd");
			writer.newLine();
			writer.write("ksldkfjaldf");
			writer.newLine();
			writer.close();
			BufferedReader reader = new BufferedReader
					(new FileReader("lala.txt"));
			System.out.println(reader.readLine());
			System.out.println(reader.readLine());
			reader.close();
		}catch(Exception e){
			
		}
		
	}

}
