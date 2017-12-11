package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo9_1 extends JFrame{

	/**
	 * @param args
	 * java绘图原理
	 */
	MyPanel mp = new MyPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_1 jf = new Demo9_1();
		System.out.println(new String[] {"sdfsfd"});
	}
	
	public Demo9_1(){
		this.add(mp);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
// 用于绘图和显示
class MyPanel extends JPanel{
	//Graphics  画笔类
	public void paint(Graphics g ){
		super.paint(g);
//		g.drawOval(10, 10, 30, 30);
//		g.drawLine(1, 4, 18, 20);
//		g.setColor(Color.gray);
//		g.fillRect(10, 10, 30, 10);
//		Image im = 
//				Toolkit.getDefaultToolkit().getImage
//				(Panel.class.getResource("/1312.jpg"));
//		g.drawImage(im, 10, 10, 180, 144, this);
		g.setColor(Color.black);
		g.setFont(new Font("华文彩云", Font.BOLD,30) );
		g.drawString("设置竖列的宽度", 12,30);
		System.out.println("asdf");
	}
}