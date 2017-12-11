package com.test3;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;
public class MyTankGame2 extends JFrame {

	/**
	 * @param args
	 */
	MyPanel my_panel = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTankGame2  game = new MyTankGame2();
	}
	
	public MyTankGame2(){
		my_panel = new MyPanel();
		Thread t = new Thread(my_panel);
		t.start();
		this.setSize(400, 300);
		this.add(my_panel);
		this.addKeyListener(my_panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
//我的面板
 class MyPanel extends JPanel implements KeyListener,Runnable {
	 //	定义一个我的坦克
	 Hero hero = null;
//	 定义敌人坦克
	 Vector<EnemyTank> ets = new  Vector<EnemyTank>();
	 int enSize = 3;
	 //	 构造函数
	 public MyPanel(){
		 hero = new Hero(150,284);
		 for(int i= 0 ;i < enSize;i++)
		 {
			 ets.add( new EnemyTank(20 +i*50,20));
			 Thread t = new Thread(ets.get(i));
			 t.start();
		 }
	 }
	 
	 public void paint(Graphics g){
		 super.paint(g);
		 g.fillRect(0, 0, 400, 300);
//		 画出自己的坦克
		 this.drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),hero.getColor());
//		 画出自己的子弹
		 if(hero.shot != null && hero.shot.isLive == true)
		 {
			 this.drawshot(hero.shot.getX(),hero.shot.getY(),g);
		 }
//		 画出敌人的坦克
		 for(int i = 0; i < ets.size(); i ++ )
		 {
			 this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(), ets.get(i).getColor());
//			 if(ets.get(i).shot.isLive == true)
//			 {
//				 this.drawshot(ets.get(i).shot.getX(),ets.get(i).shot.getY(),g);
//			 }
		 }
	 }
	 
//	 画坦克函数
	 public void drawTank(int x,int y,Graphics g,int direct ,int color){
		 switch(color){
		 case 0 :
			 g.setColor(Color.CYAN);
			 break;
		 case 1 :
			 g.setColor(Color.YELLOW);
			 break;
		 }
//		 准备画坦克
		 switch(direct){
		 case 0 :
			 g.fill3DRect(x -10, y -15, 5, 30,false);
			 g.fill3DRect(x +5,y - 15, 5, 30,false);
			 g.fill3DRect(x - 5, y - 10, 10, 20,false);
			 g.fillOval(x-5, y - 5, 10, 10);
			 g.drawLine(x , y , x , y -16);
			 break;
		 case 1 :
			 g.fill3DRect(x -15, y -10, 30, 5,false);
			 g.fill3DRect(x -15,y + 5, 30, 5,false);
			 g.fill3DRect(x - 10, y - 5, 20, 10,false);
			 g.fillOval(x-5, y - 5, 10, 10);
			 g.drawLine(x , y , x +16 , y);
			 break;
		 case 2 :
			 g.fill3DRect(x -10, y -15, 5, 30,false);
			 g.fill3DRect(x +5,y - 15, 5, 30,false);
			 g.fill3DRect(x - 5, y - 10, 10, 20,false);
			 g.fillOval(x-5, y - 5, 10, 10);
			 g.drawLine(x , y , x , y +16);
			 break;
		 case 3 :
			 g.fill3DRect(x -15, y -10, 30, 5,false);
			 g.fill3DRect(x -15,y + 5, 30, 5,false);
			 g.fill3DRect(x - 10, y - 5, 20, 10,false);
			 g.fillOval(x-5, y - 5, 10, 10);
			 g.drawLine(x , y , x -16 , y);
			 break;
		 }
	 }
//	 画子弹函数
	 public void drawshot(int x, int y,Graphics g)
	 {
		 g.fillOval(x, y, 3, 3);
	 }

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 's')
		{   
			hero.moveDown();
		}else if(e.getKeyChar() == 'w')
		{
			hero.moveUp();
		}else if(e.getKeyChar() == 'a')
		{
			hero.moveLeft();
		}else if(e.getKeyChar() == 'd')
		{
			hero.moveRight();
		}
		if(e.getKeyChar() == 'j')
		{
			hero.shotFire();
		}
		this.repaint();
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.repaint();
		}
	}
}
