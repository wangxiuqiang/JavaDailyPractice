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
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finally  implements ActionListener,MenuListener{

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
		
		
		JLabel label = new JLabel("客户结账");
		label.setBounds(133, 30, 196, 30);
		label.setFont(new Font("楷体",Font.BOLD,27));
		frame.getContentPane().add(label);
		
		JLabel trueLabel = new JLabel("请输入房间号和桌号:");
		trueLabel.setBounds(31, 70, 225, 15);
		frame.getContentPane().add(trueLabel);
		
		JLabel menu = new JLabel("菜单:");
		menu.setBounds(37, 95, 54, 15);
		frame.getContentPane().add(menu);
		
		 textArea = new JTextArea();
		textArea.setBounds(31, 120, 298, 72);
		frame.getContentPane().add(textArea);
		
		JLabel priceLabel = new JLabel("总金额");
		priceLabel.setBounds(219, 202, 54, 15);
		frame.getContentPane().add(priceLabel);
		
		
		 giveMoney = new JButton("结账");
		giveMoney.setBounds(273, 229, 93, 23);
		frame.getContentPane().add(giveMoney);
		giveMoney.addActionListener(this);
		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 66, 71, 23);
		frame.getContentPane().add(HouseAndDesk);
		HouseAndDesk.setColumns(10);
		
		 queRen = new JButton("确认");
		queRen.setBounds(239, 66, 77, 23);
		frame.getContentPane().add(queRen);
		
		textPrice = new JTextField();
		textPrice.setBounds(274, 200, 67, 19);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		
	//	frame.getContentPane().add(menuBar);
		 menu1 = new JMenu("会员");
		 menu2 = new JMenu("散客");
		 menu1.addMenuListener(this);
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
		
	}
	 JButton queRen,giveMoney;
	    JTextArea textArea;
	    JMenu menu1 ;
		JMenu menu2;
		JMenuBar menuBar;
	
	public void actionPerformed(ActionEvent e) {
	   if(e.getSource() == giveMoney){
		   system s = new system();
		   frame.dispose();
	   }
		
	}

	
	public void menuSelected(MenuEvent e) {
		if(e.getSource() == menu1){
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
