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
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("�ͻ�����");
		label.setBounds(133, 30, 196, 30);
		label.setFont(new Font("����",Font.BOLD,27));
		frame.getContentPane().add(label);
		
		JLabel trueLabel = new JLabel("�����뷿��Ż�����:");
		trueLabel.setBounds(31, 70, 225, 15);
		frame.getContentPane().add(trueLabel);
		
		JLabel menu = new JLabel("�˵�:");
		menu.setBounds(37, 95, 54, 15);
		frame.getContentPane().add(menu);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(31, 120, 298, 72);
		frame.getContentPane().add(textArea);
		
		JLabel priceLabel = new JLabel("�ܽ��:");
		priceLabel.setBounds(219, 202, 54, 15);
		frame.getContentPane().add(priceLabel);
		
		
		JButton giveMoney = new JButton("����");
		giveMoney.setBounds(273, 229, 93, 23);
		frame.getContentPane().add(giveMoney);
		
		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 66, 71, 23);
		frame.getContentPane().add(HouseAndDesk);
		HouseAndDesk.setColumns(10);
		
		JButton queRen = new JButton("ȷ��");
		queRen.setBounds(239, 66, 77, 23);
		frame.getContentPane().add(queRen);
		
		textPrice = new JTextField();
		textPrice.setBounds(274, 200, 67, 19);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		
	//	frame.getContentPane().add(menuBar);
		JMenu menu1 = new JMenu("��Ա");
		JMenu menu2 = new JMenu("ɢ��");
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
		
	}

	
	public void actionPerformed(ActionEvent e) {
	
		
	}
}
