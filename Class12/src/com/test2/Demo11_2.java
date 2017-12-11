/**
 * FileInputSteam
 */
package com.test2;
import java.io.*;
public class Demo11_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/home/min/桌面/tesdt/color.rb");
		FileInputStream fls = null;
//		因为File类没有读写的能力，需要用到input 流
		try {
			 fls = new FileInputStream(f);
			
//			定义一个字节数组
			byte[] bytes = new byte[1024];
			int n = 0;
			while((n = fls.read(bytes)) != -1)
			{
				String s = new String(bytes,0,n);
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			关闭文件流
			try {
				fls.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
