package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deskManage  implements ActionListener{

	private JFrame frame;

	public deskManage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel canTing = new JLabel("\u9910\u5385\u7BA1\u7406");
		canTing.setBounds(134, 36, 163, 34);
		canTing.setFont(new Font("���w",Font.BOLD,30));
		frame.getContentPane().add(canTing);
		
		JButton houseManage = new JButton("��������");
		
		houseManage.setBounds(162, 80, 93, 23);
		frame.getContentPane().add(houseManage);
		
		JButton houseQuery = new JButton("������ѯ");
		houseQuery.setBounds(162, 125, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		JButton reserveHouse = new JButton("���ò���");
		reserveHouse.setBounds(162, 168, 93, 23);
		frame.getContentPane().add(reserveHouse);

	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
