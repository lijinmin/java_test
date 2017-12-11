package com.test1;
import java.awt.*;
import javax.swing.*;
public class Demo8_8 extends JFrame {

	/**
	 * @param args
	 */
	JPanel jp1,jp2;
	JLabel jlb1,jlb2;
	JComboBox jcb1;
	JList jlt;
	JScrollPane jsp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_8 jf = new Demo8_8();
	}
	
	public Demo8_8(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1 = new JLabel("籍贯");
		jlb2 = new JLabel("你喜欢去哪里旅游");
		jcb1 = new JComboBox( new String[] {"北京","天津","贵州","湖北"});
		jlt = new JList(new String[] {"黄果树" ,"故宫","长城","天安门","大理"});
	    jlt.setVisibleRowCount(2);
		jsp = new JScrollPane(jlt);
	
		this.setLayout(new GridLayout(3,1));
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp2.add(jlb2);
		jp2.add(jsp);
		this.add(jp1);
		this.add(jp2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

}
