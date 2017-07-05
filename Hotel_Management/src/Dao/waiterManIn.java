package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAKey;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Jdbc.jdbcMysql;

import com.mysql.jdbc.PreparedStatement;

public class waiterManIn implements ActionListener{

	private JFrame frame;
	private JTextField idField;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField moneyField;
	private JTextField adressField;
	private JTextField telField;
    jdbcMysql jd = new jdbcMysql();
	public waiterManIn() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel headLabel = new JLabel("添加服务员");
		headLabel.setBounds(109, 0, 200, 50);
		headLabel.setFont(new Font("楷体",Font.BOLD,30));
		frame.getContentPane().add(headLabel);
		
		JLabel idLabel = new JLabel("编号");
		idLabel.setBounds(100, 40, 76, 30);
		frame.getContentPane().add(idLabel);
		
		JLabel nameLabel = new JLabel("姓名");
		nameLabel.setBounds(100, 70, 66, 30);
		frame.getContentPane().add(nameLabel);
		
		JLabel ageLabel = new JLabel("年龄");
		ageLabel.setBounds(100, 100, 66, 30);
		frame.getContentPane().add(ageLabel);
		
		JLabel moneyLabel = new JLabel("薪水");
		moneyLabel.setBounds(100, 130, 80, 22);
		frame.getContentPane().add(moneyLabel);
		
		JLabel adressLabel = new JLabel("地址");
		adressLabel.setBounds(100,160, 80, 22);
		frame.getContentPane().add(adressLabel);
		
		JLabel delLabel = new JLabel("电话");
		delLabel.setBounds(100, 189, 97, 22);
		frame.getContentPane().add(delLabel);
		
		idField = new JTextField();
		idField.setBounds(184, 40, 66, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		idField.addActionListener(this);
		
		nameField = new JTextField();
		nameField.setBounds(184, 70, 66, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		nameField.addActionListener(this);
		
		ageField = new JTextField();
		ageField.setBounds(184, 100, 66, 21);
		frame.getContentPane().add(ageField);
		ageField.setColumns(10);
		ageField.addActionListener(this);
		
		moneyField = new JTextField();
		moneyField.setBounds(184, 130, 66, 21);
		frame.getContentPane().add(moneyField);
		moneyField.setColumns(10);
		moneyField.addActionListener(this);
		
		adressField = new JTextField();
		adressField.setBounds(184,160, 66, 21);
		frame.getContentPane().add(adressField);
		adressField.setColumns(10);
		adressField.addActionListener(this);
		
		telField = new JTextField();
		telField.setBounds(184, 190, 66, 21);
		frame.getContentPane().add(telField);
		telField.setColumns(10);
		telField.addActionListener(this);
		
		 addButton = new JButton("添加");
		addButton.setBounds(86, 222, 76, 30);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);
		
		 resertButton = new JButton("返回");
		resertButton.setBounds(180, 222, 76, 30);
		frame.getContentPane().add(resertButton);
		resertButton.addActionListener(this);
		
	}
	JButton addButton,resertButton;

	public void actionPerformed(ActionEvent e) {
		String ids=null,name=null,ages=null,moneys=null,adress=null,tel=null;
		int id = 0,age = 0,money = 0;
		if(!idField.getText().isEmpty()){
			ids = idField.getText();
		 id = Integer.parseInt(ids);
		 name = nameField.getText();
		 ages = ageField.getText();
		 age = Integer.parseInt(ages);
		 moneys = moneyField.getText();
		 money = Integer.parseInt(moneys);
		 adress = adressField.getText();
		 tel = telField.getText();
		}
		if(e.getSource() == resertButton){
			waiterMan w = new waiterMan();
			frame.dispose();
		}
		if(e.getSource() == addButton){
			if(e.getSource() == addButton){
				try {
					Connection conn = jd.getConn();
					String sql = "insert into waiter(id,name,age,money,address,tel) values (?,?,?,?,?,?)";
					PreparedStatement ps =  (PreparedStatement) conn.prepareStatement(sql);
					ps.setInt(1, id);
					ps.setString(2,name);
					ps.setInt(3,age);
					ps.setInt(4,money);
					ps.setString(5, adress);
					ps.setString(6, tel);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(frame, "添加成功","成功",JOptionPane.DEFAULT_OPTION);
					ps.close();
					waiterMan s = new waiterMan();
					frame.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
	    	}
     	}
	}
}
