package com.test1;

public class Demo10_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.start();
		Cat cat1 = new Cat();
		cat1.start();
		System.out.println("haha");
	}

}
class Cat extends Thread{
//	重写run函数
	public void  run()
	{
		int i = 0;
		while(true)
		{
			i ++;
			System.out.println("hello world" + i);
			try {
				Cat.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i > 10)
			{
				break;
			}
		}
		
	}
}
