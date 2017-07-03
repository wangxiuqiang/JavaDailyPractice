package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Jdbc.jdbcMysql;

public class wineAdd implements ActionListener{

	private JFrame frame;
	private JTextField idField;
	private JTextField nameField;
	private JTextField sizeField;
	private JTextField peopleField;
	private JTextField adressField;
	private JTextField telField;
	JButton addButton;
	JButton resertButton;
	jdbcMysql jd = new jdbcMysql();

	
	public wineAdd() {
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
		
		JLabel roomLabel = new JLabel("添加菜品");
		roomLabel.setBounds(109, 0, 200, 41);
		roomLabel.setFont(new Font("楷体",Font.BOLD,30));
		frame.getContentPane().add(roomLabel);
		
		JLabel idLabel = new JLabel("编号：");
		idLabel.setBounds(100, 40, 76, 30);
		frame.getContentPane().add(idLabel);
		
		JLabel nameLabel = new JLabel("菜名：");
		nameLabel.setBounds(100, 70, 66, 30);
		frame.getContentPane().add(nameLabel);
		
		JLabel sizeLabel = new JLabel("每份金额：");
		sizeLabel.setBounds(100, 100, 66, 30);
		frame.getContentPane().add(sizeLabel);
		
		
		idField = new JTextField();
		idField.setBounds(184, 40, 66, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(184, 70, 66, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		sizeField = new JTextField();
		sizeField.setBounds(184, 100, 66, 21);
		frame.getContentPane().add(sizeField);
		sizeField.setColumns(10);
		
		
		addButton = new JButton("添加");
		addButton.setBounds(86, 222, 76, 30);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);//添加监视器
		
		resertButton = new JButton("返回");
		resertButton.setBounds(180, 222, 76, 30);
		frame.getContentPane().add(resertButton);
		resertButton.addActionListener(this);//添加监视器
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resertButton){
			food s = new food();
			frame.dispose();
		}
		
	}

}
