package Dao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class waiterMan implements ActionListener{

	private JFrame frame;

	
	public waiterMan() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel waiterLabel = new JLabel("服务员管理");
		waiterLabel.setBounds(154, 10, 155, 32);
		waiterLabel.setFont(new Font("楷体", Font.BOLD, 29));
		frame.getContentPane().add(waiterLabel);
		
		add = new JButton("添加服务员");
		add.setBounds(128, 67, 181, 32);
		frame.getContentPane().add(add);
		add.addActionListener(this);//��Ӽ�����

		
		revise = new JButton("修改服务员");
		revise.setBounds(128, 126, 181, 32);
		frame.getContentPane().add(revise);
		revise.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("返回");
		returnOut.setBounds(128, 192, 181, 32);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
	}

	JButton returnOut;
	JButton add;
	JButton revise;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			waiterManIn s = new waiterManIn();
			frame.dispose();
		}
		if(e.getSource() == revise){
			waiterChange s = new waiterChange();
			frame.dispose();
		}
		if(e.getSource() == returnOut){
			staff s = new staff();
			frame.dispose();
		}
		
	}
}
