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
		canTing.setFont(new Font("楷体",Font.BOLD,23));
		frame.getContentPane().add(canTing);
		
		houseManage = new JButton("房间管理");
		houseManage.setBounds(149, 77, 93, 23);
		frame.getContentPane().add(houseManage);
		
		houseQuery = new JButton("房间查询");
		houseQuery.setBounds(149, 110, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		 reserveHouse = new JButton("预定房间");
		reserveHouse.setBounds(149, 143, 93, 23);
		frame.getContentPane().add(reserveHouse);
		
		startHouse = new JButton("启用房间");
		startHouse.setBounds(149, 176, 93, 23);
		frame.getContentPane().add(startHouse);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);

		// frame.getContentPane().add(menuBar);
		JMenu menu1 = new JMenu("会员");
		JMenu menu2 = new JMenu("散客");
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
	}
	JButton reserveHouse;
	JButton startHouse;
	JButton houseQuery;
	JButton houseManage;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == houseManage){
			roomMangement  s = new roomMangement();
		}
		
	}
}
