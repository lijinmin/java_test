package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_10 extends JFrame {

	/**
	 * @param args
	 */
	JTextArea jta;
	JPanel jp1;
	JComboBox jcb;
	JTextField jtf;
	JButton jb;
	JScrollPane jsp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_10 jf = new Demo8_10();
	}
	
	public Demo8_10(){
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jp1 = new JPanel();
		jcb = new JComboBox(new String[] {"小菊","小兰","小梅"});
		jtf = new JTextField(10);
		jb = new JButton("发送");
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		this.add(jsp);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setSize(400, 300);
//		this.setIconImage(new ImageIcon("img/lala.png").getImage());
		this.setTitle("腾讯聊天");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
