package Dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class queryHouse implements ActionListener{

	private JFrame frame;
	JTextArea textArea ;
	JButton button;
	public queryHouse() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("文泉驿微米黑", Font.PLAIN, 17));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("房间信息");
		label.setFont(new Font("文泉驿微米黑", Font.BOLD, 27));
		label.setBounds(176, 28, 162, 33);
		frame.getContentPane().add(label);
		
		 textArea = new JTextArea();
		textArea.setBounds(87, 73, 297, 141);
		textArea.setEditable(false);
		textArea.append("名称\t\t价格\t\t数量\n");
		frame.getContentPane().add(textArea);
		
		 button = new JButton("返回");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(329, 226, 72, 23);
		frame.getContentPane().add(button);
	}


	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			HouseManagement h = new HouseManagement();
			frame.dispose();
		}
	}
}
