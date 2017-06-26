package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class waiterMan {

	private JFrame frame;

	
	public waiterMan() {
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
		JLabel waiterLabel = new JLabel("����Ա����");
		waiterLabel.setBounds(154, 10, 155, 32);
		waiterLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(waiterLabel);
		
		JButton add = new JButton("��ӷ���Ա");
		add.setBounds(128, 67, 181, 32);
		frame.getContentPane().add(add);
		
		JButton revise = new JButton("�޸ķ���Ա��Ϣ");
		revise.setBounds(128, 126, 181, 32);
		frame.getContentPane().add(revise);
		
		JButton returnOut = new JButton("����");
		returnOut.setBounds(128, 192, 181, 32);
		frame.getContentPane().add(returnOut);
	}
}
