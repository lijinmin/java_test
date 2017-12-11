package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_6 extends JFrame {

	/**
	 * @param args
	 */
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf1,jtf2;
	JPasswordField jpw;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_6 jf = new Demo8_6();
	}
   
	public Demo8_6(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jlb1 = new JLabel("用户名");
		jlb2 = new JLabel("密码");
		jb1 = new JButton("确定");
		jb2 = new JButton("取消");
		jtf1 = new JTextField(10);
		jpw = new JPasswordField(10);
		
		this.setLayout(new GridLayout(3,1));
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jpw);
		jp3.add(jb2);
		jp3.add(jb1);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
