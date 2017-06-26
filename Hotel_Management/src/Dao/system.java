package Dao;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class system {

	private JFrame frame;


	public system() {
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
		JLabel systemLabel = new JLabel("��������ϵͳ");
		systemLabel.setBounds(134, 23, 201, 34);
		systemLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(systemLabel);
		
		JButton staff = new JButton("Ա������");
		staff.setBounds(81, 140, 93, 23);
		frame.getContentPane().add(staff);
		
		JButton member = new JButton("��Ա����");
		member.setBounds(259, 80, 93, 23);
		frame.getContentPane().add(member);
		
		JButton food = new JButton("��Ʒ����");
		food.setBounds(259, 140, 93, 23);
		frame.getContentPane().add(food);
		
		JButton restaurant = new JButton("��������");
		restaurant.setBounds(81, 80, 93, 23);
		frame.getContentPane().add(restaurant);
		
		JButton checkOut = new JButton("����");
		checkOut.setBounds(81, 192, 93, 23);
		frame.getContentPane().add(checkOut);
		
		JButton returnOut = new JButton("�˳�");
		returnOut.setBounds(259, 192, 93, 23);
		frame.getContentPane().add(returnOut);
	}

}
