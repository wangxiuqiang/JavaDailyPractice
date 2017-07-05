package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class roomMangement implements ActionListener{

	private JFrame frame;

	
	public roomMangement() {
		initialize();frame.setVisible(true);
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
		
		JLabel roomLabel = new JLabel("房间管理");
		roomLabel.setBounds(147, 25, 135, 35);
		roomLabel.setFont(new Font("楷体",Font.BOLD,30));
		frame.getContentPane().add(roomLabel);
		
		addButton = new JButton("添加房间");
		addButton.setBounds(125, 73, 158, 35);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);//添加监视器
		
		reviseButton = new JButton("修改房间");
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
			roomIn s = new roomIn();
			frame.dispose();
		}
		if(e.getSource() == reviseButton){
			roomChange s = new roomChange();
			frame.dispose();
		}
		
	}
}
