package Dao;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Jdbc.jdbcMysql;




public class index implements ActionListener{

	private JFrame frame;
	private JTextField textName;
	private JPasswordField password;
    jdbcMysql jd = new jdbcMysql();
    
	
	public index() {
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
		
		JLabel systemLabel = new JLabel("≤ÕÃ¸π‹¿ÌœµÕ≥");
		systemLabel.setBounds(123, 22, 241, 32);
		systemLabel.setFont(new Font("ÀŒÃÂ", Font.BOLD, 29));
		frame.getContentPane().add(systemLabel);
	     
		
		JLabel name = new JLabel("’À∫≈");
		name.setBounds(115, 90, 54, 15);
		frame.getContentPane().add(name);
		
		textName = new JTextField();
		textName.setBounds(166, 87, 134, 21);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		textName.addActionListener(this);
		
		JLabel passwd = new JLabel("√‹¬Î");
		passwd.setBounds(115, 132, 54, 15);
		frame.getContentPane().add(passwd);
		
		password = new JPasswordField();
		password.setBounds(166, 129, 134, 21);
		frame.getContentPane().add(password);
		password.addActionListener(this);
		
		submit = new JButton("µ«¬º");
		submit.setBounds(125, 160, 65, 23);
		frame.getContentPane().add(submit);
		submit.addActionListener(this);//ÃÌº”º‡ ”∆˜
		 reset = new JButton("÷ÿ÷√");
		reset.setBounds(235, 160, 65, 23);
		frame.getContentPane().add(reset);
		reset.addActionListener(this);
	}
	JButton submit;
	JButton reset;
	public void actionPerformed(ActionEvent e) {
		String name = textName.getText();
		String passwd = password.getText();
		String name1 = null;
		String passwd1 = null;
		if(e.getSource() == submit){
		try {
			Connection conn = jd.getConn();
			Statement st = conn.createStatement();
			String sql = "SELECT * FROM admin";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()){
				name1 = rs.getString("id");
				passwd1 = rs.getString("passwd");
			}
			rs.close();
			st.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
			if(name.equals(name1) && passwd.equals(passwd1)){
				system s = new system();
				frame.dispose();
			}
			else{
				JTextField s = new JTextField();
				s.setEditable(false);
				s.setText("’À∫≈∫Õ√‹¬Î≤ª∆•≈‰");
				s.setBounds(166, 110, 134, 21);
				frame.add(s);
			}
			
		}
		if (e.getSource() == reset){
			textName.setText("");
			password.setText("");
		}
		
	}
}
