package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class waiterChange {

	private JFrame frame;
	private JTextField IDField;
	private JTextField comBoxField;


	public waiterChange() {
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
		
		JLabel headLabel = new JLabel("�޸ķ���Ա��Ϣ");
		headLabel.setFont(new Font("����",Font.BOLD,35));
		headLabel.setBounds(108, 10, 282, 41);
		frame.getContentPane().add(headLabel);
		
		JLabel IDLabel = new JLabel("���");
		IDLabel.setBounds(108, 73, 88, 36);
		frame.getContentPane().add(IDLabel);
		
		IDField = new JTextField();
		IDField.setBounds(218, 81, 66, 21);
		frame.getContentPane().add(IDField);
		IDField.setColumns(10);
		
		JButton QueRenButton = new JButton("ȷ��");	
		QueRenButton.setBounds(313, 81, 77, 21);
		frame.getContentPane().add(QueRenButton);
		
		JLabel informationLabel = new JLabel("��ѡ��Ҫ�޸ĵ�����");
		informationLabel.setBounds(108, 112, 173, 21);
		frame.getContentPane().add(informationLabel);
		
		String[] str = {"���","����","����","��ַ", "�绰"};
		
		JComboBox comboBox = new JComboBox(str);
		comboBox.setBounds(105, 143, 95, 21);
		frame.getContentPane().add(comboBox);
		
		JButton changeButton = new JButton("����");
		changeButton.setBounds(313, 142, 77, 23);
		frame.getContentPane().add(changeButton);
		
		comBoxField = new JTextField();
		comBoxField.setBounds(218, 143, 66, 21);
		frame.getContentPane().add(comBoxField);
		comBoxField.setColumns(10);
	}
}
