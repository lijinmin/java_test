package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_4 extends JFrame {

	/**
	 * @param args
	 */
	JButton[] jb = new JButton[9]  ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_4 jf = new Demo8_4();
	}
	
	public Demo8_4(){
		
		for(int i=0; i<9;i++){
			jb[i] = new JButton(String.valueOf(i + 1));
			this.add(jb[i]);
		}
		this.setLayout(new GridLayout(3,3));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(200, 200);
	}

}
