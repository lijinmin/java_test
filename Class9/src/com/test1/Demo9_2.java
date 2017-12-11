package com.test1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo9_2 extends JFrame implements ActionListener {

	/**
	 * @param args
	 * 事件处理
	 */
	MyPanel1 mp =  null;
	JButton jb1=null;
	JButton jb2 = null;
	Graphics g;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_2 demo = new Demo9_2();
	}
	public Demo9_2(){
		mp = new MyPanel1();
		mp.setBackground(Color.black);
		jb1 = new JButton("黑色");
		jb2 = new JButton("红色");
		jb1.addActionListener(this);
		jb1.addActionListener(new Cat());
		jb2.addActionListener(this);
		jb1.setActionCommand("jb1");
		jb2.setActionCommand("红色");
		this.add(jb1,BorderLayout.NORTH);
		this.add(mp,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
//	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("jb1")){
//			mp.setBackground(Color.black);
			
		}else{
//			mp.setBackground(Color.red);
		}
	}

}
class MyPanel1 extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0,400, 300);
	}
}
class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print("cat cat ");
	}
	
}
