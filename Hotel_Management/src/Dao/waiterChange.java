package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

import javax.sql.rowset.serial.SerialArray;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class waiterChange implements ActionListener, ItemListener {

	private JFrame frame;
	private JTextField IDField;
	private JTextField comBoxField;
	JComboBox comboBox;
	JButton changeButton;
	JButton QueRenButton;
	String str = null;
	int id;
	jdbcMysql jd = new jdbcMysql();

	public waiterChange() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel headLabel = new JLabel("修改服务员");
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

		JLabel informationLabel = new JLabel("");
		informationLabel.setBounds(108, 112, 173, 21);
		frame.getContentPane().add(informationLabel);

		String[] str = { "下拉选择", "编号", "姓名", "地址", "薪水", "电话", "年龄" };

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
		comBoxField.addActionListener(this);
	}

	public String getString1() {
		if (str.equals("编号")) {
			return "id";
		}
		if (str.equals("姓名")) {
			return "name";
		}
		if (str.equals("电话")) {
			return "tel";
		}
		if (str.equals("地址")) {
			return "adress";
		}
		if (str.equals("年龄")) {
			return "age";
		}
		if (str.equals("薪水")) {
			return "money";
		} else {
			return "";
		}
	}

	public void itemStateChanged(ItemEvent e) {
		str = comboBox.getSelectedItem().toString();

	}

	public void actionPerformed(ActionEvent e) {
		String ids = null;
		if (!IDField.getText().isEmpty()) {
			ids = IDField.getText();

		}
		String str = comBoxField.getText();
		String combo = null;
		if (e.getSource() == QueRenButton) {
			id = Integer.parseInt(ids);
		}
		if (e.getSource() == changeButton) {

			if (!IDField.getText().isEmpty()) {
				combo = getString1();
				int flag = 1;
				if (combo.equals("id") && combo.equals("age") && combo.equals("money")) {
					flag = 0;
				}
				try {
					Connection conn = jd.getConn();
					Statement st = (Statement) conn.createStatement();
					String sql = null;
					if (flag == 1) {
						sql = "update waiter set " + combo + " = '" + str + "' where id = " + id;
					} else {
						sql = "update waiter set " + combo + " = " + str + " where id = " + id;
					}
					st.execute(sql);
					st.close();
					JOptionPane.showMessageDialog(frame, "更改成功", "消息", JOptionPane.DEFAULT_OPTION);
					waiterMan s = new waiterMan();
					frame.dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(frame, "编号不能为空", "消息", JOptionPane.DEFAULT_OPTION);
				waiterMan w = new waiterMan();
				frame.dispose();
			}
		}
	}
}
