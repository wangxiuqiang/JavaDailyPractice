package Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class memberChange implements ActionListener, ItemListener {

	private JFrame frame;
	private JTextField IDField;
	private JTextField comBoxField;
	JComboBox comboBox;
	JButton QueRenButton;
	JButton changeButton;
	jdbcMysql jd = new jdbcMysql();
	String str = null;
	int id;

	public memberChange() {
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

		JLabel headLabel = new JLabel("修改会员");
		headLabel.setFont(new Font("楷体", Font.BOLD, 35));
		headLabel.setBounds(108, 10, 282, 41);
		frame.getContentPane().add(headLabel);

		JLabel IDLabel = new JLabel("编号");
		IDLabel.setBounds(108, 73, 88, 36);
		frame.getContentPane().add(IDLabel);

		IDField = new JTextField();
		IDField.setBounds(218, 81, 66, 21);
		frame.getContentPane().add(IDField);
		IDField.setColumns(10);
		IDField.addActionListener(this);

		QueRenButton = new JButton("确认");
		QueRenButton.setBounds(313, 81, 77, 21);
		frame.getContentPane().add(QueRenButton);
		QueRenButton.addActionListener(this);

		JLabel informationLabel = new JLabel("请选择修改内容");
		informationLabel.setBounds(108, 112, 173, 21);
		frame.getContentPane().add(informationLabel);

		String[] str = { "下拉选择", "id", "姓名", "电话" };

		comboBox = new JComboBox(str);
		comboBox.setBounds(105, 143, 95, 21);
		frame.getContentPane().add(comboBox);
		comboBox.addItemListener(this);

		changeButton = new JButton("更改");
		changeButton.setBounds(313, 142, 77, 23);
		frame.getContentPane().add(changeButton);
		changeButton.addActionListener(this);

		comBoxField = new JTextField();
		comBoxField.setBounds(218, 143, 66, 21);
		frame.getContentPane().add(comBoxField);
		comBoxField.setColumns(10);
	}

	public String getString1() {
		if (str.equals("id")) {
			return "id";
		}
		if (str.equals("姓名")) {
			return "name";
		}
		if (str.equals("电话")) {
			return "tel";
		}
		else {
			return "";
		}
	}

	public void itemStateChanged(ItemEvent e) {
		str = comboBox.getSelectedItem().toString();
		
	}

	public void actionPerformed(ActionEvent e) {
		String ids =null; 
		if(!IDField.getText().isEmpty()){
		 ids = IDField.getText();
		
		}
		String str = comBoxField.getText();
		String combo = null;
		if (e.getSource() == QueRenButton) {
			id = Integer.parseInt(ids);
		}
		if (e.getSource() == changeButton) {
			combo = getString1();
			// System.out.println(this.str);
			try {
				Connection conn = jd.getConn();
				 Statement st = (Statement) conn.createStatement();
                 String sql = "update member set " +combo+" = '"+ str +"' where id = "+id;
                 st.execute(sql);
                 st.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
