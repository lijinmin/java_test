package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_2 extends JFrame {

	/**
	 * @param args
	 */
	JButton jb1, jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_2 jf = new Demo8_2();
	}

	public Demo8_2(){
		jb1 = new JButton("alkdf");
		jb2 = new JButton("sdfawe");
		jb3 = new JButton("sdfwe");
		jb4 = new JButton("seefsdf");
		jb5 = new JButton("sdweew");
		
		//边界布局
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2,BorderLayout.EAST);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4,BorderLayout.NORTH);
		this.add(jb5,BorderLayout.SOUTH);
		
		this.setTitle("哈哈哈");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
