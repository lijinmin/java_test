/**
 * File类的基本用法
 */
package com.test1;
import java.io.*;
public class Demo11_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建一个文件对象
//		File f = new File("/home/min/桌面/tesdt/color.rb");
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.length());
//		System.out.println(f.canRead());
//		创建文件
//		File f = new File("/home/min/桌面/tesdt/color1.rb");
//		if(!f.exists())
//		{
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		创建文件夹
//		File f = new File("/home/min/桌面/tesdt/aa");
//		if(!f.isDirectory())
//		{
//			f.mkdir();
//		}
//		列出文件夹下的所有文件
		File f = new File("/home/min/桌面/tesdt");
		if(f.isDirectory())
		{
			File[] list = f.listFiles();
			for(int i=0;i < list.length;i++)
			{
				System.out.println(list[i].getName());
			}
		}
	}

}
