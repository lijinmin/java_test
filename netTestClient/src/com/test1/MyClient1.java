/**
 * 这是一个客户端程序 可以连接服务器端
 */
package com.test1;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class MyClient1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient1 client = new MyClient1();
	}
	
	public MyClient1(){
		try {
//			去连接某个服务器端
			Socket s = new Socket("127.0.0.1",9999);
//			如果s连接成功，就向服务器端发送数据
//			PrintWriter是一个输出流，这句代表向s写数据，true 代表即使刷新
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			pw.println("你好！我是客户端");
//			接收服务器端的消息
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String info = br.readLine();
			System.out.println("客户端接受到了:" + info);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
