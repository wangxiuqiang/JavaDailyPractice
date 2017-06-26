package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class index {

	private JFrame frame;
	private JTextField textName;
	private JPasswordField password;

	
	public index() {
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
		systemLabel.setBounds(123, 22, 241, 32);
		systemLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(systemLabel);
	     
		
		JLabel name = new JLabel("�˺�");
		name.setBounds(115, 90, 54, 15);
		frame.getContentPane().add(name);
		
		textName = new JTextField();
		textName.setBounds(166, 87, 134, 21);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel passwd = new JLabel("����");
		passwd.setBounds(115, 132, 54, 15);
		frame.getContentPane().add(passwd);
		
		password = new JPasswordField();
		password.setBounds(166, 129, 134, 21);
		frame.getContentPane().add(password);
		
		JButton submit = new JButton("��¼");
		
		submit.setBounds(125, 160, 65, 23);
		frame.getContentPane().add(submit);
		
		JButton reset = new JButton("����");
		reset.setBounds(235, 160, 65, 23);
		frame.getContentPane().add(reset);
	}
}
