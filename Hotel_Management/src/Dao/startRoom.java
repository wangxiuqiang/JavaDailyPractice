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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class startRoom implements ActionListener,ItemListener{

	private JFrame frame;
	private JTextField food11;
	private JTextField food22;
	private JTextField food33;
	private JTextField food44;
	private JTextField food55;
	private JTextField food66;
	private JTextField food77;
	private JTextField food88;
	JCheckBox food1,food2,food3,food4,food5,food6,food7,food8;
	JButton queRenButton,backButton;
	public startRoom() {
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
		
		 food1 = new JCheckBox("1");
		food1.setBounds(24, 66, 94, 34);
		frame.getContentPane().add(food1);
		
		food11 = new JTextField();
		food11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(food11);
		food11.setColumns(10);
		
		 food2 = new JCheckBox("2");
		food2.setBounds(24, 102, 94, 34);
		frame.getContentPane().add(food2);
		
		 food3 = new JCheckBox("3");
		food3.setBounds(24, 138, 94, 34);
		frame.getContentPane().add(food3);
		
		 food4 = new JCheckBox("4");
		food4.setBounds(24, 174, 94, 34);
		frame.getContentPane().add(food4);
		
		food22 = new JTextField();
		food22.setBounds(136, 109, 39, 21);
		frame.getContentPane().add(food22);
		food22.setColumns(10);
		
		food33 = new JTextField();
		food33.setColumns(10);
		food33.setBounds(136, 145, 39, 21);
		frame.getContentPane().add(food33);
		
		food44 = new JTextField();
		food44.setColumns(10);
		food44.setBounds(136, 181, 39, 21);
		frame.getContentPane().add(food44);
		
		 food5 = new JCheckBox("5");
		food5.setBounds(237, 66, 94, 34);
		frame.getContentPane().add(food5);
		
		 food6 = new JCheckBox("6");
		food6.setBounds(237, 102, 94, 34);
		frame.getContentPane().add(food6);
		
		 food7 = new JCheckBox("7");
		food7.setBounds(237, 138, 94, 34);
		frame.getContentPane().add(food7);
		
		 food8 = new JCheckBox("8");
		food8.setBounds(237, 174, 94, 34);
		frame.getContentPane().add(food8);
		
		food55 = new JTextField();
		food55.setColumns(10);
		food55.setBounds(332, 73, 39, 21);
		frame.getContentPane().add(food55);
		
		food66 = new JTextField();
		food66.setColumns(10);
		food66.setBounds(332, 109, 39, 21);
		frame.getContentPane().add(food66);
		
		food77 = new JTextField();
		food77.setColumns(10);
		food77.setBounds(332, 145, 39, 21);
		frame.getContentPane().add(food77);
		
		food88 = new JTextField();
		food88.setColumns(10);
		food88.setBounds(332, 181, 39, 21);
		frame.getContentPane().add(food88);
		
		 queRenButton = new JButton("确认");
		queRenButton.setBounds(115, 214, 71, 23);
		frame.getContentPane().add(queRenButton);
		
		 backButton = new JButton("返回");
		backButton.setBounds(227, 214, 71, 23);
		frame.getContentPane().add(backButton);
		
		JLabel label_1 = new JLabel("/\u4EFD");
		label_1.setBounds(176, 76, 39, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("/\u4EFD");
		label_2.setBounds(176, 112, 39, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("/\u4EFD");
		label_3.setBounds(176, 148, 39, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("/\u4EFD");
		label_4.setBounds(176, 184, 39, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("/\u4EFD");
		label_5.setBounds(372, 76, 39, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("/\u4EFD");
		label_6.setBounds(372, 112, 39, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("/\u4EFD");
		label_7.setBounds(372, 148, 39, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("/\u4EFD");
		label_8.setBounds(372, 184, 39, 15);
		frame.getContentPane().add(label_8);
	}


	
	public void itemStateChanged(ItemEvent e) {
	   if(e.getItem() == food1){
		   
	   }
	}


	
	public void actionPerformed(ActionEvent e) {
	
	}
}


