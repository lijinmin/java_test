package com.test5;
public class Demo10_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWidown tw1 = new TicketWidown();
		Thread t = new Thread(tw1);
		Thread t1 = new Thread(tw1);
		t.start();
		t1.start();
	}

}
//售票窗口类
class TicketWidown implements Runnable{
	private int num = 2000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(this)
			{
				if(num > 0 )
				{
					System.out.println(Thread.currentThread().getName() + "正在售出" + num + "票");
					num --;
				}else{
					break;
				}
			}

		}
	}
}