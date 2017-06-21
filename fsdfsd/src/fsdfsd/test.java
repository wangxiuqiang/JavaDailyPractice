package fsdfsd;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class test extends JFrame {
	String str;
	
	 /**
	  * 两个组件分配不同的监视器 一个text取值  在点击按钮输出在控制台  ]
	  * 都重写ActionListener的actionPerformed方法  必须在输入文本框后
	  * 按回车让输入生效  否则按按钮后输出null
	  */
	

	public test() {
		init();
		setTitle("TEst");
		setVisible(true);
		setBounds(100, 110, 500, 300);
	}

	public void init() {
		
		setLayout(null);
		JTextField textField = new JTextField();
		JTextField textField2 = new JTextField();
		JButton button = new JButton("Test");
		button.setBounds(20, 20, 100, 20);
		add(button);
		JTextFieldListener a = new JTextFieldListener();
		JButtonListener b = new JButtonListener();
		textField.setBounds(50, 50, 60, 20);
		textField2.setBounds(70, 70, 60, 20);
		textField2.setEditable(false);
		add(textField);
		add(textField2);
		a.setField(textField2);
		textField.addActionListener(a);
		button.addActionListener(b);
	}
}
