/**
 * 字符流
 */
package com.test5;
import java.io.*;
public class Demo11_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		try{
			fr = new FileReader("/home/min/桌面/tesdt/color1.rb");
			fw = new FileWriter("/home/min/桌面/tesdt/color2.rb");
			bfr = new BufferedReader(fr);
			bfw = new BufferedWriter(fw);
			char[] chars = new char[1024];
			int n = 0;
			while(fr.ready())
			{
				n = fr.read(chars);
			
				fw.append(new String(chars,0,n));
			}
		}catch(Exception e){
			
		}finally{
			try {
				fr.close();
				fw.close();
				bfr.close();
				bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
