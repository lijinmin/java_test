package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_9 extends JFrame {

	/**
	 * @param args
	 */
	JList jlt;
	JSplitPane jsp;
	JLabel jlb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_9 jf = new Demo8_9();
	}
	
	public Demo8_9(){
		jlt = new JList(new String[] {"cat","dog","frog","bird"});
		jlb = new JLabel(new ImageIcon("img/lala.png"));
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlt,jlb);
		jsp.setOneTouchExpandable(true);
		this.add(jsp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
