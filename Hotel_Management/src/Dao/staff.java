package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class staff {

	private JFrame frame;

	
	public staff() {
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
		JLabel staffLabel = new JLabel("Ա������");
		staffLabel.setBounds(160, 24, 132, 43);
		staffLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(staffLabel);
		
		JButton waiter = new JButton("����Ա����");
		waiter.setBounds(160, 77, 132, 31);
		frame.getContentPane().add(waiter);
		
		JButton chef = new JButton("��ʦ����");
		chef.setBounds(160, 134, 132, 31);
		frame.getContentPane().add(chef);
		
		JButton returnOut = new JButton("����");
		returnOut.setBounds(160, 191, 132, 31);
		frame.getContentPane().add(returnOut);
	}

}
