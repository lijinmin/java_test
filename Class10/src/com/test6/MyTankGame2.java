package com.test6;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
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
		this.addKeyListener(my_panel.hero);
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
//	 定义炸弹
	 Vector<Bomb> bombs = new Vector<Bomb>();
//	 定义敌人坦克总数
	 int enSize = 6;
//	 定义初始化敌人坦克数量
	 int defaultEnSize = 3;
//	 定义敌人坦克的增加速度
	 int isIncre = 100;
//	 定义三张图片
	 Image image1 = null;
	 Image image2 = null;
	 Image image3 = null;
//	 定义panel的宽
	 int panel_h = 400;
//	 定义panel 的高
	 int panel_l = 300;
	 //	 构造函数
	 public MyPanel(){
		 
		 hero = new Hero(150,284);
		 for(int i= 0 ;i <defaultEnSize;i++)
		 {
			 enSize--;
			 int x = (int) (Math.random()*360) + 20;
			 int y = (int) (Math.random()*200) +20;
			 EnemyTank e = new EnemyTank(x,y);
			 ets.add( e);
			 Thread t = new Thread(ets.get(i));
			 t.start();
		 }
		 
//		 初始化三张图片
//		 image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/1.gif"));
//		 image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/2.gif"));
//		 image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/3.gif"));
		 try {
			image1 = ImageIO.read(new File("/home/min/workspace/Class10/src/1.gif"));
			image2 = ImageIO.read(new File("/home/min/workspace/Class10/src/2.gif"));
			image3 = ImageIO.read(new File("/home/min/workspace/Class10/src/3.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 Bomb b = new Bomb(-30,-30);
//		 bombs.add(b);
	 }
	 
	 public void paint(Graphics g){
		 super.paint(g);
		 g.fillRect(0, 0, panel_h, panel_l);
		 if(hero.isLive == true)
		 {
//			 画出自己的坦克
			 this.drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),hero.getColor());
//			 画出自己的子弹
			 if(hero.shots != null)
			 {
				 synchronized(this)
				 {
					 for(Shot e : hero.shots)
					 {
						 if(e.isLive == true){
							 this.drawshot(e.getX(),e.getY(),g);
						 }else{
							 hero.is_fire = true;
						 }
					 }
				 }
			 }
		 }

//		 画出敌人的坦克
		 for(int i = 0; i < ets.size(); i ++ )
		 {
			 EnemyTank t = ets.get(i);
			 if(t.isLive == true)
			 {
				 this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(), ets.get(i).getColor());
				 if(ets.get(i).shots != null)
				 {
					 for(int ii = 0;ii < ets.get(i).shots.size(); ii++)
					 {
						 Shot e = ets.get(i).shots.get(ii);
						 if(e.isLive == true)
						 {
							 this.drawshot(e.getX(), e.getY(), g);
						 }else{
							 ets.get(i).shots.remove(e);
//							 ets.get(i).is_fire = true;
						 }
					 }
				 }	 
			 }else{
				 ets.remove(t);
			 }
		 }
//		 画出炸弹
		 for(int i = 0; i < bombs.size(); i ++)
		 {
			 
			Bomb b = bombs.get(i);
			 if(b.life >= 6)
			 {
				 g.drawImage(image3,b.x,b.y, 30, 30, this);
			 }
			 else if(b.life < 6&&b.life >= 3){
				 g.drawImage(image2,b.x,b.y, 30, 30, this);
			 }
			 else{
				 g.drawImage(image1,b.x,b.y, 30, 30, this);
			 }
			 b.lifeDown();
			 if(b.life == 0)
			 {
				 bombs.remove(b);
			 }
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
		this.repaint();
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	判断子弹是否击中目标
	public void hitTank(Shot e,Tank t)
	{
		switch(t.direct)
		{
			case 0 :
			case 2 :
				if((e.x > t.x - 10 && e.x < t.x + 10)&&(e.y > t.y -15 && e.y < t.y + 15))
				{
					t.isLive = false;
					e.isLive = false;
					Bomb b = new Bomb(t.x,t.y);
					bombs.add(b);
				}
				break;
			case 1:
			case 3:
				if((e.x > t.x - 15 && e.x < t.x + 15)&&(e.y > t.y -10 && e.y < t.y + 10))
				{
					t.isLive = false;
					e.isLive = false;
					Bomb b = new Bomb(t.x,t.y);
					bombs.add(b);
				}
				break;
		}

			
	}
	
	public void increEn(){
		 if(enSize > 0)
		 {
			 enSize--;
			 int x = (int) (Math.random()*360) + 20;
			 int y = (int) (Math.random()*200) +20;
			 EnemyTank e = new EnemyTank(x,y);
			 ets.add( e);
			 Thread t = new Thread(e);
			 t.start();
		 }
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
//			我方子弹打击敌方
			for(Shot e : hero.shots)
			{
				for(EnemyTank t  :  ets)
				{
					this.hitTank(e, t);
				}
			}
//			敌人子弹打我的坦克
			for(int i = 0;i < ets.size();i++)
			{
				for(int ii =0;ii<ets.get(i).shots.size();ii++)
				{
					Shot e = ets.get(i).shots.get(ii);
					this.hitTank(e, hero);
				}
			}
//			增加敌人坦克
			if(isIncre==0|| ets.size()==0)
			{
				this.isIncre = (int) (Math.random()*20) + 80;
				this.increEn();
			}else{
				this.isIncre--;
			}
			this.repaint();
		}
	}
}
