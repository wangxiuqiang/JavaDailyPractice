package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HouseManagement  implements ActionListener{

	private JFrame frame;

	public HouseManagement() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel canTing = new JLabel("\u9910\u5385\u7BA1\u7406");
		canTing.setBounds(139, 28, 161, 26);
		canTing.setFont(new Font("����",Font.BOLD,23));
		frame.getContentPane().add(canTing);
		
		JButton houseManage = new JButton("�������");
		houseManage.setBounds(149, 77, 93, 23);
		frame.getContentPane().add(houseManage);
		
		JButton houseQuery = new JButton("�����ѯ");
		houseQuery.setBounds(149, 110, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		JButton reserveHouse = new JButton("Ԥ������");
		reserveHouse.setBounds(149, 143, 93, 23);
		frame.getContentPane().add(reserveHouse);
		
		JButton startHouse = new JButton("���÷���");
		startHouse.setBounds(149, 176, 93, 23);
		frame.getContentPane().add(startHouse);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);

		// frame.getContentPane().add(menuBar);
		JMenu menu1 = new JMenu("����");
		JMenu menu2 = new JMenu("����");
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
	}

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
