/*
 * gui 界面
 */
package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo1_8 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton jb1 = new JButton("我是一个按钮");
		Demo1_8 jf = new Demo1_8();
		jf.add(jb1);
	}
	
	public Demo1_8(){
		// JFrame 是一个底层容器类（可以添加其他Swing 组建）
//		JFrame jf = new JFrame();
		
		this.setTitle("哈哈");
		this.setSize(800, 800);
//		jf.add(jb1);
		this.setLocation(80, 80);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
