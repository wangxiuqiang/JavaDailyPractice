package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.PortableInterceptor.DISCARDING;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deskManage implements ActionListener {

	private JFrame frame;

	public deskManage() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel canTing = new JLabel("大厅管理");
		canTing.setBounds(134, 36, 163, 34);
		canTing.setFont(new Font("楷体", Font.BOLD, 30));
		frame.getContentPane().add(canTing);

		houseManage = new JButton("餐厅管理");
		houseManage.setBounds(162, 80, 93, 23);
		frame.getContentPane().add(houseManage);
		houseManage.addActionListener(this);

		houseQuery = new JButton("餐桌查询");
		houseQuery.setBounds(162, 125, 93, 23);
		frame.getContentPane().add(houseQuery);
		houseQuery.addActionListener(this);

		reserveHouse = new JButton("启用餐桌");
		reserveHouse.setBounds(162, 168, 93, 23);
		frame.getContentPane().add(reserveHouse);
		reserveHouse.addActionListener(this);

		button = new JButton("返回");
		button.setBounds(162, 207, 93, 23);
		frame.getContentPane().add(button);
		button.addActionListener(this);

	}

	JButton houseQuery;
	JButton reserveHouse;
	JButton houseManage;
	JButton button;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == houseManage) {
			deskMange_1 s = new deskMange_1();
			frame.dispose();
		}
		if (e.getSource() == button) {
			system s = new system();
			frame.dispose();
		}
		if (e.getSource() == reserveHouse) {
			startRoom s = new startRoom();
			frame.dispose();
		}
		if (e.getSource() == houseQuery) {
			frame.dispose();
		}
	}
}
