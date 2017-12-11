/**
 * 记事本
 */
package com.test7;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
public class Demo11_7 extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	JTextArea jta = null;
//	定义菜单条
	JMenuBar jmb = null;
//	定义菜单
	JMenu jm1 = null;
//	定义一个菜单项
	JMenuItem jmi1 = null;
	JMenuItem jmi2 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11_7 demo = new Demo11_7();
	}
	public Demo11_7(){
		jta = new JTextArea();
		jmb = new JMenuBar();
		jm1 = new JMenu("文件");
		jmi1 = new JMenuItem("打开",new ImageIcon("src/tushuguan-22.png"));
		jmi2 = new JMenuItem("保存",new ImageIcon("src/xinxi-22.png"));
//		设置助记符
		jm1.setMnemonic('F');
		jmb.add(jm1);
		jm1.add(jmi1);
		jm1.add(jmi2);
		jmi1.addActionListener(this);
		jmi1.setActionCommand("open");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		this.setJMenuBar(jmb);
		this.add(jta);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("open"))
		{
			JFileChooser jfcoo = new JFileChooser();
			jfcoo.setDialogTitle("请选择文件...");
			jfcoo.showOpenDialog(null);
			jfcoo.setVisible(true);
//			得到用户选择的绝对路径
			String filename = jfcoo.getSelectedFile().getAbsolutePath();
			FileReader  fr = null;
			BufferedReader bfr = null;
			try {
				fr = new FileReader(filename);
				bfr = new BufferedReader(fr);
				String allcontent = "";
				while(bfr.ready())
				{
					String str = bfr.readLine();
					allcontent += str + "\r\n";
				}
				jta.setText(allcontent);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					fr.close();
					bfr.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}else if (e.getActionCommand().equals("save"))
		{
			JFileChooser jfcoo1 = new JFileChooser();
			jfcoo1.setDialogTitle("另存为...");
			jfcoo1.showSaveDialog(null);
			jfcoo1.setVisible(true);
//			得到文件保存的路径
			String filename1 = jfcoo1.getSelectedFile().getAbsolutePath();
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter("/home/min/桌面/bb.txt");
				bw = new BufferedWriter(fw);
				bw.write(this.jta.getText());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					bw.close();
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
