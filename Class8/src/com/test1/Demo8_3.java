package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_3 extends JFrame {

	/**
	 * @param args
	 */
	JButton[] jb1 = new JButton[6];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_3 jf = new Demo8_3();
	}
	
	public Demo8_3(){
		jb1[0] = new JButton("sdfsd");
		jb1[2] = new JButton("sdfd");
		jb1[1] = new JButton("2esfd");
		jb1[3] = new JButton("2fsddsf");
		jb1[4] = new JButton("8sdfd");
		jb1[5] = new JButton("w9esdf");
		
		this.add(jb1[0]);
		this.add(jb1[1]);
		this.add(jb1[4]);
		//流式布局
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.setTitle("sdf");
		this.setSize(300,400);
//		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
