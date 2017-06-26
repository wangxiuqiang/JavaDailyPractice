package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class member {

	private JFrame frame;

	
	public member() {
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
		JLabel memberLabel = new JLabel("��Ա����");
		memberLabel.setBounds(164, 27, 136, 34);
		memberLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(memberLabel);
		
		JButton add = new JButton("��ӻ�Ա");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add.setBounds(45, 86, 136, 34);
		frame.getContentPane().add(add);
		
		JButton revise = new JButton("�޸Ļ�Ա��Ϣ");
		revise.setBounds(254, 86, 136, 34);
		frame.getContentPane().add(revise);
		
		JButton chaXu = new JButton("��Ա��Ϣ��ѯ");
		chaXu.setBounds(45, 176, 136, 34);
		frame.getContentPane().add(chaXu);
		
		JButton returnOut = new JButton("����");
		returnOut.setBounds(254, 176, 136, 34);
		frame.getContentPane().add(returnOut);
	}

}
