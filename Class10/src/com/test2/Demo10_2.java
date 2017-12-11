package com.test2;

public class Demo10_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Thread t = new Thread(dog);
		t.start();
	}

}
class Dog implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true)
		{
			i ++;
			System.out.println("hello world" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i >  10)
			{
				break;
			}
		}
	}
	
}