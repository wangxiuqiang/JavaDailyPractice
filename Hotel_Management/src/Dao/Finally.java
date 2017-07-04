package Dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Finally implements ActionListener, MenuListener {

	private JFrame frame;
	private JTextField HouseAndDesk;
	private JTextField textPrice;
	jdbcMysql jd = new jdbcMysql();
	int sumMoney = 0;
	JTable query;
	JScrollPane sp;
	String id1;
	DefaultTableCellRenderer tcr;
	JTableHeader header;
	String[][] info = new String[50][3];

	public Finally() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("客户结账");
		label.setBounds(133, 30, 196, 30);
		label.setFont(new Font("楷体", Font.BOLD, 27));
		frame.getContentPane().add(label);

		JLabel trueLabel = new JLabel("请输入房间号和桌号:");
		trueLabel.setBounds(31, 70, 225, 15);
		frame.getContentPane().add(trueLabel);

		JLabel menu = new JLabel("菜单:");
		menu.setBounds(37, 95, 54, 15);
		frame.getContentPane().add(menu);

		JLabel priceLabel = new JLabel("总金额");
		priceLabel.setBounds(219, 202, 54, 15);
		frame.getContentPane().add(priceLabel);

		giveMoney1 = new JButton("结账");
		giveMoney1.setBounds(273, 229, 93, 23);
		frame.getContentPane().add(giveMoney1);
		giveMoney1.addActionListener(this);
		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 66, 71, 23);
		frame.getContentPane().add(HouseAndDesk);
		HouseAndDesk.setColumns(10);
		HouseAndDesk.addActionListener(this);
		queRen = new JButton("确认");
		queRen.setBounds(239, 66, 77, 23);
		frame.getContentPane().add(queRen);

		textPrice = new JTextField();
		textPrice.setBounds(274, 200, 67, 19);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		textPrice.setEditable(false);
		textPrice.addActionListener(this);
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);

		// frame.getContentPane().add(menuBar);
		menu1 = new JMenu("会员");
		menu2 = new JMenu("散客");
		menu1.addMenuListener(this);
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
		queRen.addActionListener(this);
		giveMoney1.addActionListener(this);
	}

	JButton queRen, giveMoney1;

	JMenu menu1;
	JMenu menu2;
	JMenuBar menuBar;
	Connection conn;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == giveMoney1) {
			String sql = "delete from menuin where id = " + id1;
			String sql1 = "update houseanddesk set flag = 0 where id =" + id1;
			try {
				Statement sm = (Statement) conn.createStatement();
				sm.execute(sql);
				sm.execute(sql1);
			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(frame, "结账成功", "提示", JOptionPane.DEFAULT_OPTION);
			system s = new system();
			frame.dispose();
		}
		if (e.getSource() == queRen) {
			if (!HouseAndDesk.getText().isEmpty()) {
				id1 = HouseAndDesk.getText();
				String[] title = { "名称", "价格", "数量" };
				try {
					int i = 0;
					conn = jd.getConn();
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
						info[i][2] = num + "";
						sumMoney += (price * num);
						i++;
					}
					// textPrice.setText(""+sumMoney);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				query = new JTable(info, title);

				// header = query.getTableHeader();
				// tcr = new DefaultTableCellRenderer();
				// tcr.setHorizontalAlignment(Label.CENTER);
				// query.getColumn("名称").setCellRenderer(tcr);
				// query.getColumn("价格").setCellRenderer(tcr);
				// query.getColumn("数量").setCellRenderer(tcr);
				sp = new JScrollPane();
				query.setBackground(Color.LIGHT_GRAY);
				frame.getContentPane().add(sp);
				sp.setBounds(31, 95, 298, 72);
				sp.setViewportView(query);
				textPrice.setText("" + sumMoney);
			} else {
				JOptionPane.showMessageDialog(frame, "房间号不能为空", "错误", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void menuSelected(MenuEvent e) {
		if (e.getSource() == menu1) {
			memberFinally m = new memberFinally();
			frame.dispose();
		}
	}

	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}
}
