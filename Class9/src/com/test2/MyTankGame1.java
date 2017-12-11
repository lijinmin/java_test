package com.test2;
import java.awt.*;
import javax.swing.*;
public class MyTankGame1 extends JFrame {

	/**
	 * @param args
	 */
	MyPanel my_panel = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTankGame1  game = new MyTankGame1();
	}
	
	public MyTankGame1(){
		my_panel = new MyPanel();
		this.setSize(400, 300);
		this.add(my_panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
//我的面板
 class MyPanel extends JPanel{
	 //	定义一个我的坦克
	 Hero hero = null;
	 
	 //	 构造函数
	 public MyPanel(){
		 hero = new Hero(100,10);
	 }
	 
	 public void paint(Graphics g){
		 super.paint(g);
		 g.fillRect(0, 0, 400, 300);
		 this.drawTank(hero.getX(),hero.getY(),g,0,1);
	 }
	 
//	 画坦克函数
	 public void drawTank(int x,int y,Graphics g,int direct ,int type){
		 switch(type){
		 case 0 :
			 g.setColor(Color.CYAN);
			 break;
		 case 1 :
			 g.setColor(Color.YELLOW);
			 break;
		 }
		 
		 switch(direct){
		 case 0 :
//			 准备画坦克
			 g.fill3DRect(x, y, 5, 30,false);
			 g.fill3DRect(x + 15,y, 5, 30,false);
			 g.fill3DRect(x+5, y +5, 10, 20,false);
			 g.fillOval(x+5, y +10, 10, 10);
			 g.drawLine(x + 10, y + 15, x + 10, y -6);
			 break;
		 }
	 }
}
//坦克类
class Tank{
//	坦克的横坐标
	int x=0;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//	坦克的纵坐标
	int y=0;
	public Tank(int x ,int y){
		this.x  = x;
		this.y = y;
	}
	
}
//我的坦克
class Hero extends Tank{

	public Hero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
}