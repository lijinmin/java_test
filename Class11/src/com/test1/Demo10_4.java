package com.test1;

public class Demo10_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.start();
		Thread t = new Thread(dog);
		t.start();
		Thread t1 = new Thread(dog);
		t1.start();

	}

}
class Cat extends Thread{
	public void run()
	{
		System.out.println("11");
	}
}
class Dog implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("22");
	}
	
}