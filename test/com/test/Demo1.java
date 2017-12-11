package com.test;

public class Demo1 {

	/**
	 * @param args
	 * 接口
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usb camera = new Camera();
		camera.start();
		camera.stop();
		System.out.println(Usb.a);
	}

}
interface Usb{
	int a = 9;
	public void start();
	public void stop();
}

class Camera implements Usb {
	public void start(){
		System.out.println("start working");
	}
	
	public void stop(){
		System.out.println("stop working");
	}
}
