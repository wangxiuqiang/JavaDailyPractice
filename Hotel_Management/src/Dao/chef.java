package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class chef {

	private JFrame frame;

	
	public chef() {
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
		JLabel chefLabel = new JLabel("��ʦ����");
		chefLabel.setBounds(154, 10, 155, 32);
		chefLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(chefLabel);
		
		JButton add = new JButton("��ӳ�ʦ");
		add.setBounds(128, 67, 181, 32);
		frame.getContentPane().add(add);
		
		JButton revise = new JButton("�޸ĳ�ʦ��Ϣ");
		revise.setBounds(128, 126, 181, 32);
		frame.getContentPane().add(revise);
		
		JButton returnOut = new JButton("����");
		returnOut.setBounds(128, 192, 181, 32);
		frame.getContentPane().add(returnOut);
	}

}
