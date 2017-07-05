package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class deskMange_1 implements ActionListener{

	private JFrame frame;

	
	public deskMange_1() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel roomLabel = new JLabel("餐桌管理");
		roomLabel.setBounds(147, 25, 135, 35);
		roomLabel.setFont(new Font("楷体",Font.BOLD,30));
		frame.getContentPane().add(roomLabel);
		
		addButton = new JButton("添加餐桌");
		//addButton.setBackground(Color.LIGHT_GRAY);
		addButton.setBounds(125, 73, 158, 35);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);//添加监视器
		
		reviseButton = new JButton("修改餐桌");
		reviseButton.setBounds(124, 125, 158, 35);
		frame.getContentPane().add(reviseButton);
		reviseButton.addActionListener(this);//添加监视器
		
		returnOut = new JButton("返回");
		returnOut.setBounds(124, 179, 158, 35);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//添加监视器
	}

	JButton addButton;
	JButton reviseButton;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == returnOut){
			HouseManagement s = new HouseManagement();
			frame.dispose();
		}
		if(e.getSource() == addButton){
			deskIn s = new deskIn();
			frame.dispose();
		}
		if(e.getSource() == reviseButton){
			deskChange s = new deskChange();
			frame.dispose();
		}
		
	}
}
