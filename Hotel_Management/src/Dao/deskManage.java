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
		
		
		JLabel canTing = new JLabel("��������");
		canTing.setBounds(134, 36, 163, 34);
		canTing.setFont(new Font("���w",Font.BOLD,30));
		frame.getContentPane().add(canTing);
		
		 houseManage = new JButton("��������");
		
		houseManage.setBounds(162, 80, 93, 23);
		frame.getContentPane().add(houseManage);
		
		 houseQuery = new JButton("������ѯ");
		houseQuery.setBounds(162, 125, 93, 23);
		frame.getContentPane().add(houseQuery);
		
		 reserveHouse = new JButton("���ò���");
		reserveHouse.setBounds(162, 168, 93, 23);
		frame.getContentPane().add(reserveHouse);
		
		button = new JButton("����");
		button.setBounds(162, 207, 93, 23);
		frame.getContentPane().add(button);
		button.addActionListener(this);//��Ӽ�����

	}
	JButton houseQuery;
	JButton reserveHouse;
	JButton houseManage;
	JButton button;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			chef s = new chef();
			frame.dispose();
		}
		if(e.getSource() == houseManage){
			deskMange_1  s = new deskMange_1();
		}
	}
}
