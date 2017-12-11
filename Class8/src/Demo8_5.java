import java.awt.*;
import javax.swing.*;
public class Demo8_5 extends JFrame {

	/**
	 * @param args
	 * 
	 * 混合布局
	 */
	JButton[] jb1 = new JButton[5];
	JButton[] jb2 = new JButton[5];
	JPanel[] jp = new JPanel[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_5 jf = new Demo8_5();
	}
	
	public Demo8_5(){
		// JPanel 的布局模式 流布局 FlowLayout
		jp[0] = new JPanel();
		jp[1] = new JPanel();
		
		jb1[0] = new JButton("sdf");
		jb1[1] = new JButton("dsdf");
		jb1[2] = new JButton("sdfe");
		jb1[4] = new JButton("sdfwef");
		
		jp[0].add(jb1[0]);
		jp[1].add(jb1[2]);
		
		this.add(jp[0], BorderLayout.NORTH);
		this.add(jp[1],BorderLayout.SOUTH);
		this.add(jb1[4],BorderLayout.CENTER);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
