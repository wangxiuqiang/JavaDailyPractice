
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

public class startRoomDriver {

	private JFrame frame;
	private JTextField driver11;
	private JTextField driver22;
	private JTextField driver33;
	private JTextField driver44;
	private JTextField driver55;
	private JTextField driver66;

	public startRoomDriver() {
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

		JCheckBox driver1 = new JCheckBox("New check box");
		driver1.setBounds(24, 66, 94, 34);
		frame.getContentPane().add(driver1);

		driver11 = new JTextField();
		driver11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(driver11);
		driver11.setColumns(10);

		JCheckBox driver2 = new JCheckBox("New check box");
		driver2.setBounds(24, 119, 94, 34);
		frame.getContentPane().add(driver2);

		JCheckBox driver3 = new JCheckBox("New check box");
		driver3.setBounds(24, 174, 94, 34);
		frame.getContentPane().add(driver3);

		driver22 = new JTextField();
		driver22.setBounds(136, 126, 39, 21);
		frame.getContentPane().add(driver22);
		driver22.setColumns(10);

		driver33 = new JTextField();
		driver33.setColumns(10);
		driver33.setBounds(136, 181, 39, 21);
		frame.getContentPane().add(driver33);

		JCheckBox driver4 = new JCheckBox("New check box");
		driver4.setBounds(237, 66, 94, 34);
		frame.getContentPane().add(driver4);

		JCheckBox driver5 = new JCheckBox("New check box");
		driver5.setBounds(237, 119, 94, 34);
		frame.getContentPane().add(driver5);

		JCheckBox driver6 = new JCheckBox("New check box");
		driver6.setBounds(237, 174, 94, 34);
		frame.getContentPane().add(driver6);

		driver44 = new JTextField();
		driver44.setColumns(10);
		driver44.setBounds(332, 73, 39, 21);
		frame.getContentPane().add(driver44);

		driver55 = new JTextField();
		driver55.setColumns(10);
		driver55.setBounds(332, 126, 39, 21);
		frame.getContentPane().add(driver55);

		driver66 = new JTextField();
		driver66.setColumns(10);
		driver66.setBounds(332, 181, 39, 21);
		frame.getContentPane().add(driver66);

		JButton queRenButton = new JButton("确认");
		queRenButton.setBounds(115, 214, 71, 23);
		frame.getContentPane().add(queRenButton);

		JButton backButton = new JButton("返回");
		backButton.setBounds(227, 214, 71, 23);
		frame.getContentPane().add(backButton);
		
		JLabel label_1 = new JLabel("/\u74F6");
		label_1.setBounds(177, 76, 54, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("/\u74F6");
		label_2.setBounds(177, 129, 54, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("/\u74F6");
		label_3.setBounds(177, 184, 54, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("/\u74F6");
		label_4.setBounds(370, 76, 54, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("/\u74F6");
		label_5.setBounds(370, 129, 54, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("/\u74F6");
		label_6.setBounds(370, 184, 54, 15);
		frame.getContentPane().add(label_6);
	}
}
