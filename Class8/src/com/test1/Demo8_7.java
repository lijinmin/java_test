package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_7 extends JFrame {

	/**
	 * @param args
	 */
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JCheckBox jcb1,jcb2;
	JRadioButton jrb1,jrb2;
	ButtonGroup jg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_7 demo = new Demo8_7();
	}
	
	public Demo8_7(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("你喜欢的运动");
		jlb2 = new JLabel("你的性别");
		
		jb1 = new JButton("注册用户");
		jb2 = new JButton("取消注册");
		
		jcb1 = new JCheckBox("足球");
		jcb2 = new JCheckBox("篮球");
		
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		jg = new ButtonGroup();
		
		jg.add(jrb1);
		jg.add(jrb1);
		
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp2.add(jlb2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setLayout(new GridLayout(3,1));
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
