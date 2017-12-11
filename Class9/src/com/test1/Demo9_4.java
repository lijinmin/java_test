package com.test1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Demo9_4 extends JFrame{

	/**
	 * @param args
	 */
	MyPanel2 mp = null;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Demo9_4 demo = new Demo9_4();
	}
	
	public Demo9_4(){
		mp = new MyPanel2();
		this.addKeyListener(mp);
		this.add(mp);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,300);
	}

}
class MyPanel2 extends JPanel implements KeyListener{
	public MyOval my_oval = new MyOval(10,10);
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.CYAN);
		g.fillOval(this.my_oval.getX(), this.my_oval.getY(), 10, 10);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			if(this.my_oval.getY() <= 288){
				this.my_oval.setY(this.my_oval.getY() +3);
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_UP){
			this.my_oval.setY(this.my_oval.getY() - 1);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			this.my_oval.setX(this.my_oval.getX() + 2);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			this.my_oval.setX(this.my_oval.getX() - 1);
		}
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class MyOval implements KeyListener{
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
	int x;
	int y;
	public MyOval(int x,int y){
		this.x = x;
		this.y = y;
	}
	public MyOval(){
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
