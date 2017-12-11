/**
 * 缓冲字符流
 */
package com.test6;
import java.io.*;
public class Demo11_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try{
			FileReader fr = new FileReader("/home/min/桌面/tesdt/color1.rb");
			FileWriter fw = new FileWriter("/home/min/桌面/tesdt/color2.rb");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
//			循环读取
			while(br.ready())
			{
				String str = br.readLine();
//				System.out.println(str);
				bw.write(str);
				bw.write("\n");
			}
		}catch(Exception e){
			
		}finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
