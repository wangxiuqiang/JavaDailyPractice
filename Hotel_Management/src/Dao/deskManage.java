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
		
		
		JLabel canTing = new JLabel("餐厅管理");
		canTing.setBounds(134, 36, 163, 34);
		canTing.setFont(new Font("宋體",Font.BOLD,30));
		frame.getContentPane().add(canTing);
		
		JButton houseManage = new JButton("餐桌管理");
		
		houseManage.setBounds(162, 80, 93, 23);
		frame.getContentPane().add(houseManage);
		
		JButton houseQuery = new JButton("餐桌查询");
		houseQuery.setBounds(162, 125, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		JButton reserveHouse = new JButton("启用餐桌");
		reserveHouse.setBounds(162, 168, 93, 23);
		frame.getContentPane().add(reserveHouse);
		
		button = new JButton("返回");
		button.setBounds(162, 207, 93, 23);
		frame.getContentPane().add(button);
		button.addActionListener(this);//添加监视器

	}

	JButton button;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			chef s = new chef();
			frame.dispose();
		}
	}
}
