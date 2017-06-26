package Dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HouseManagement  implements ActionListener{

	private JFrame frame;

	public HouseManagement() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel canTing = new JLabel("\u9910\u5385\u7BA1\u7406");
		canTing.setBounds(170, 34, 54, 15);
		frame.getContentPane().add(canTing);
		
		JButton houseManage = new JButton("�������");
		
		houseManage.setBounds(131, 78, 93, 23);
		frame.getContentPane().add(houseManage);
		
		JButton houseQuery = new JButton("�����ѯ");
		houseQuery.setBounds(131, 120, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		JButton reserveHouse = new JButton("Ԥ������");
		reserveHouse.setBounds(131, 164, 93, 23);
		frame.getContentPane().add(reserveHouse);
		
		JButton startHouse = new JButton("���÷���");
		startHouse.setBounds(131, 205, 93, 23);
		frame.getContentPane().add(startHouse);
	}

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
