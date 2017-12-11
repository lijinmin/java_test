/**
 * 这是第一个服务器端 监听端口9999，可以接收客户端发过来的数据
 */
package com.test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class MyServer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer1 server = new MyServer1();
	}

	public MyServer1(){
		try {
//			在9999号端口监听
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("我是服务器 在 9999监听");
//			等待某个客户端链接，该函数会返回一个socket连接
			Socket s = ss.accept();
//			System.out.println("11");
//			读取s中传递的数据
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String info = br.readLine();
			System.out.println("服务器接受到了:" + info);
//			向客户端发生消息
//			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//			pw.println("你好！我是服务器端");
			OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
			BufferedWriter bw = new BufferedWriter(osw);
			osw.write("你好！我是服务器端");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
