package Dao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class chef implements ActionListener{

	private JFrame frame;

	
	public chef() {
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
		
		JLabel chefLabel = new JLabel("��ʦ����");
		chefLabel.setBounds(154, 10, 155, 32);
		chefLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(chefLabel);
		
		add = new JButton("��ӳ�ʦ");
		add.setBounds(128, 67, 181, 32);
		frame.getContentPane().add(add);
		add.addActionListener(this);//��Ӽ�����
		
		revise = new JButton("�޸ĳ�ʦ��Ϣ");
		revise.setBounds(128, 126, 181, 32);
		frame.getContentPane().add(revise);
		revise.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("����");
		returnOut.setBounds(128, 192, 181, 32);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
	}

	JButton add;
	JButton revise;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			chefAdd s = new chefAdd();
			frame.dispose();
		}
		if(e.getSource() == revise){
			chefChange s = new chefChange();
			frame.dispose();
		}
		if(e.getSource() == returnOut){
			staff s = new staff();
			frame.dispose();
		}
		
	}

}
