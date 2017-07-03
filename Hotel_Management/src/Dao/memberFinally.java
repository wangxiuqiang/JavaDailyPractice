package Dao;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class memberFinally implements ActionListener, MenuListener {
	jdbcMysql jd = new jdbcMysql();
	JTable query;
	JScrollPane sp;
	String id1;
	DefaultTableCellRenderer tcr;
	JTableHeader header;
    String[][] info = new String[50][2];
	private JFrame frame;
	private JTextField HouseAndDesk;
	private JTextField zheKouText;
	private JTextField textPrice;
    int sumMoney = 0;
	public memberFinally() {
		initialize();
		frame.setVisible(true);
	}
     
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("客户结账");
		label.setBounds(187, 24, 54, 15);
		frame.getContentPane().add(label);

		JLabel trueLabel = new JLabel("请选择房间号或桌号:");
		trueLabel.setBounds(31, 50, 225, 15);
		frame.getContentPane().add(trueLabel);

		JLabel menu = new JLabel("菜单:");
		menu.setBounds(31, 75, 54, 15);
		frame.getContentPane().add(menu);
		
		JLabel priceLabel = new JLabel("总金额:");
		priceLabel.setBounds(220, 177, 54, 15);
		frame.getContentPane().add(priceLabel);

		JLabel daZheLabel = new JLabel("折扣后:");
		daZheLabel.setBounds(220, 202, 54, 15);
		frame.getContentPane().add(daZheLabel);

		giveMoney = new JButton("结账");
		giveMoney.setBounds(273, 227, 93, 23);
		frame.getContentPane().add(giveMoney);
		giveMoney.addActionListener(this);

		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 46, 71, 23);
		frame.getContentPane().add(HouseAndDesk);
		HouseAndDesk.setColumns(10);
		HouseAndDesk.addActionListener(this);

		queRen = new JButton("确认");
		queRen.setBounds(236, 46, 77, 23);
		frame.getContentPane().add(queRen);
        queRen.addActionListener(this);
		zheKouText = new JTextField();
		zheKouText.setBounds(273, 202, 67, 19);
		frame.getContentPane().add(zheKouText);
		zheKouText.setColumns(10);
		zheKouText.addActionListener(this);

		textPrice = new JTextField();
		textPrice.setBounds(273, 177, 67, 19);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
        textPrice.addActionListener(this);
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);

		// frame.getContentPane().add(menuBar);
		menu1 = new JMenu("会员");
		menu2 = new JMenu("散客");
		menuBar.add(menu1);
		menuBar.add(menu2);
		menu2.addMenuListener(this);
		frame.setJMenuBar(menuBar);
	}

	JButton queRen, giveMoney;
	
	JMenu menu1;
	JMenu menu2;
	JMenuBar menuBar;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == queRen) {
			if(!HouseAndDesk.getText().isEmpty()){
				id1 = HouseAndDesk.getText();
				String[] title = {"名称","价格"};
				try {
					int i = 0;
					Connection conn = jd.getConn();
					String sql = "select name,price,num from menuin where id = " + id1;
					Statement statement = (Statement) conn.createStatement();
					ResultSet rs = statement.executeQuery(sql);
					while (rs.next()) {
					String idString = rs.getString("name");
					String name = rs.getString("price");
					int price = rs.getInt("price");
					int num = rs.getInt("num");
					info[i][0] = idString;
					info[i][1] = name;
					sumMoney += (price * num);
						i++;
					}
					//textPrice.setText(""+sumMoney);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				query = new JTable(info,title);	
				query.setBackground(Color.LIGHT_GRAY);
				//header = query.getTableHeader();
//				tcr = new DefaultTableCellRenderer();
//				tcr.setHorizontalAlignment(Label.CENTER);
//				query.getColumn("名称").setCellRenderer(tcr);
//				query.getColumn("价格").setCellRenderer(tcr);
				sp = new JScrollPane();
				frame.add(sp);
				sp.setBounds(31, 95, 298, 72);
				sp.setViewportView(query);
				
				
			}
			else{
				JOptionPane.showMessageDialog(frame,"房间号不能为空", "错误",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == giveMoney) {
			system s = new system();
			frame.dispose();
		}
		
	}

	public void menuSelected(MenuEvent e) {
		if (e.getSource() == menu2) {
			Finally f = new Finally();
			frame.dispose();
		}
	}

	public void menuDeselected(MenuEvent e) {

	}

	public void menuCanceled(MenuEvent e) {

	}
}
