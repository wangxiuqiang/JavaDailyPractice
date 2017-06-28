
package Dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class startRoomSoup {

	private JFrame frame;
	private JTextField soup11;
	private JTextField soup22;
	private JTextField soup33;
	private JTextField soup44;
	private JTextField soup55;
	private JTextField soup66;

	public startRoomSoup() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u60A8\u7684\u4F73\u80B4");
		label.setFont(new Font("楷体", Font.BOLD, 18));
		label.setBounds(141, 26, 157, 34);
		frame.getContentPane().add(label);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 105, 21);
		frame.getContentPane().add(menuBar);

		JMenu food = new JMenu("菜品");
		menuBar.add(food);

		JMenu soup = new JMenu("汤类");
		menuBar.add(soup);

		JMenu driver = new JMenu("酒品");
		menuBar.add(driver);

		JCheckBox soup1 = new JCheckBox("New check box");
		soup1.setBounds(24, 66, 94, 34);
		frame.getContentPane().add(soup1);

		soup11 = new JTextField();
		soup11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(soup11);
		soup11.setColumns(10);

		JCheckBox soup2 = new JCheckBox("New check box");
		soup2.setBounds(24, 119, 94, 34);
		frame.getContentPane().add(soup2);

		JCheckBox soup3 = new JCheckBox("New check box");
		soup3.setBounds(24, 174, 94, 34);
		frame.getContentPane().add(soup3);

		soup22 = new JTextField();
		soup22.setBounds(136, 126, 39, 21);
		frame.getContentPane().add(soup22);
		soup22.setColumns(10);

		soup33 = new JTextField();
		soup33.setColumns(10);
		soup33.setBounds(136, 181, 39, 21);
		frame.getContentPane().add(soup33);

		JCheckBox soup4 = new JCheckBox("New check box");
		soup4.setBounds(237, 66, 94, 34);
		frame.getContentPane().add(soup4);

		JCheckBox soup5 = new JCheckBox("New check box");
		soup5.setBounds(237, 119, 94, 34);
		frame.getContentPane().add(soup5);

		JCheckBox soup6 = new JCheckBox("New check box");
		soup6.setBounds(237, 174, 94, 34);
		frame.getContentPane().add(soup6);

		soup44 = new JTextField();
		soup44.setColumns(10);
		soup44.setBounds(332, 73, 39, 21);
		frame.getContentPane().add(soup44);

		soup55 = new JTextField();
		soup55.setColumns(10);
		soup55.setBounds(332, 126, 39, 21);
		frame.getContentPane().add(soup55);

		soup66 = new JTextField();
		soup66.setColumns(10);
		soup66.setBounds(332, 181, 39, 21);
		frame.getContentPane().add(soup66);

		JButton queRenButton = new JButton("确认");
		queRenButton.setBounds(115, 214, 71, 23);
		frame.getContentPane().add(queRenButton);

		JButton backButton = new JButton("返回");
		backButton.setBounds(227, 214, 71, 23);
		frame.getContentPane().add(backButton);
		
		JLabel label_1 = new JLabel("/\u4EFD");
		label_1.setBounds(177, 76, 54, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("/\u4EFD");
		label_2.setBounds(177, 129, 54, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("/\u4EFD");
		label_3.setBounds(177, 184, 54, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("/\u4EFD");
		label_4.setBounds(373, 76, 39, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("/\u4EFD");
		label_5.setBounds(373, 129, 39, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("/\u4EFD");
		label_6.setBounds(373, 184, 39, 15);
		frame.getContentPane().add(label_6);
	}
}




