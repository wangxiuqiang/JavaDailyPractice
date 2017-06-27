package Dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class memberFinally implements ActionListener {

	private JFrame frame;
	private JTextField HouseAndDesk;
	private JTextField zheKouText;
	private JTextField textPrice;

	
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

		JLabel trueLabel = new JLabel("请输入房间号或桌号:");
		trueLabel.setBounds(31, 50, 225, 15);
		frame.getContentPane().add(trueLabel);

		JLabel menu = new JLabel("菜单:");
		menu.setBounds(31, 75, 54, 15);
		frame.getContentPane().add(menu);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(31, 95, 298, 72);
		frame.getContentPane().add(textArea);

		JLabel priceLabel = new JLabel("总金额:");
		priceLabel.setBounds(220, 177, 54, 15);
		frame.getContentPane().add(priceLabel);

		JLabel daZheLabel = new JLabel("折扣后:");
		daZheLabel.setBounds(220, 202, 54, 15);
		frame.getContentPane().add(daZheLabel);

		JButton giveMoney = new JButton("结账");
		giveMoney.setBounds(273, 227, 93, 23);
		frame.getContentPane().add(giveMoney);

		HouseAndDesk = new JTextField();
		HouseAndDesk.setBounds(148, 46, 71, 23);
		frame.getContentPane().add(HouseAndDesk);
		HouseAndDesk.setColumns(10);

		JButton queRen = new JButton("确认");
		queRen.setBounds(236, 46, 77, 23);
		frame.getContentPane().add(queRen);

		zheKouText = new JTextField();
		zheKouText.setBounds(273, 202, 67, 19);
		frame.getContentPane().add(zheKouText);
		zheKouText.setColumns(10);

		textPrice = new JTextField();
		textPrice.setBounds(273, 177, 67, 19);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);

		// frame.getContentPane().add(menuBar);
		JMenu menu1 = new JMenu("会员");
		JMenu menu2 = new JMenu("散客");
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
