package Dao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finally  implements ActionListener{

	private JFrame frame;
	private JTextField HouseAndDesk;
	private JTextField textPrice;

	public Finally() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		init();
	}
//中文
	private void init() {
		
		frame.setLayout(null);
		
		
		JLabel label = new JLabel("锟酵伙拷锟斤拷锟斤拷");
		label.setBounds(133, 30, 196, 30);
		label.setFont(new Font("锟斤拷锟斤拷",Font.BOLD,27));
		frame.add(label);
		
		JLabel trueLabel = new JLabel("锟斤拷锟斤拷锟诫房锟斤拷呕锟斤拷锟斤拷锟�:");
		trueLabel.setBounds(31, 70, 225, 15);
		frame.add(trueLabel);
		
		JLabel menu = new JLabel("锟剿碉拷:");
		menu.setBounds(37, 95, 54, 15);
		frame.add(menu);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(31, 120, 298, 72);
		frame.add(textArea);
		
		JLabel priceLabel = new JLabel("锟杰斤拷锟�:");
		priceLabel.setBounds(219, 202, 54, 15);
		frame.add(priceLabel);
		
		
		JButton giveMoney = new JButton("锟斤拷锟斤拷");
		giveMoney.setBounds(273, 229, 93, 23);
		frame.add(giveMoney);
		
		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 66, 71, 23);
		frame.add(HouseAndDesk);
		HouseAndDesk.setColumns(10);
		
		JButton queRen = new JButton("确锟斤拷");
		queRen.setBounds(239, 66, 77, 23);
		frame.add(queRen);
		
		textPrice = new JTextField();
		textPrice.setBounds(274, 200, 67, 19);
		frame.add(textPrice);
		textPrice.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		
	//	frame.getContentPane().add(menuBar);
		JMenu menu1 = new JMenu("锟斤拷员");
		JMenu menu2 = new JMenu("散锟斤拷");
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
		
	}

	
	public void actionPerformed(ActionEvent e) {

	}
}
