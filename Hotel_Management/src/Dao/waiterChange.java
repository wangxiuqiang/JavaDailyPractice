package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class waiterChange  implements ActionListener,ItemListener{

	private JFrame frame;
	private JTextField IDField;
	private JTextField comBoxField;
	JComboBox comboBox;
	JButton changeButton;
	JButton QueRenButton ;
	String str = null;
    int id;
    jdbcMysql jd= new jdbcMysql();
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
		IDField.addActionListener(this);
		
		QueRenButton = new JButton("ȷ��");	
		QueRenButton.setBounds(313, 81, 77, 21);
		frame.getContentPane().add(QueRenButton);
		QueRenButton.addActionListener(this);
		
		JLabel informationLabel = new JLabel("��ѡ��Ҫ�޸ĵ�����");
		informationLabel.setBounds(108, 112, 173, 21);
		frame.getContentPane().add(informationLabel);
		
		String[] str = {"����ѡ��","���","����","����","нˮ","��ַ", "�绰"};
		
		 comboBox = new JComboBox(str);
		comboBox.setBounds(105, 143, 95, 21);
		frame.getContentPane().add(comboBox);
		comboBox.addItemListener(this);
		
		changeButton = new JButton("����");
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
		if (str.equals("���")) {
			return "id";
		}
		if (str.equals("����")) {
			return "name";
		}
		if (str.equals("�绰")) {
			return "tel";
		}
		if (str.equals("��ַ")) {
			return "adress";
		}
		if (str.equals("����")) {
			return "age";
		}
		if (str.equals("нˮ")) {
			return "money";
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
			int flag = 1;
			if(combo.equals("id") && combo.equals("age") &&combo.equals("money")){
				flag = 0;
			}
			// System.out.println(this.str);
			
			try {
				Connection conn = jd.getConn();
				 Statement st = (Statement) conn.createStatement();
                 String sql = null;
                 if(flag == 1){
                 sql= "update waiter set " +combo+" = '"+ str +"' where id = "+id;
                 }
                 else{
                	 sql= "update waiter set " +combo+" = "+ str +" where id = "+id;
                 }
                 st.execute(sql);
                 st.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
