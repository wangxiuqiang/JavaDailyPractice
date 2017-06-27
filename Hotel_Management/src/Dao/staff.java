package Dao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class staff implements ActionListener{

	private JFrame frame;

	
	public staff() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel staffLabel = new JLabel("员工管理");
		staffLabel.setBounds(160, 24, 132, 43);
		staffLabel.setFont(new Font("宋体", Font.BOLD, 29));
		frame.getContentPane().add(staffLabel);
		
		waiter = new JButton("服务员管理");
		waiter.setBounds(160, 77, 132, 31);
		frame.getContentPane().add(waiter);
		waiter.addActionListener(this);//添加监视器
		
		chef = new JButton("厨师管理");
		chef.setBounds(160, 134, 132, 31);
		frame.getContentPane().add(chef);
		chef.addActionListener(this);//添加监视器
		
		returnOut = new JButton("返回");
		returnOut.setBounds(160, 191, 132, 31);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//添加监视器
		
	}

	
	JButton waiter;
	JButton chef;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == waiter){
			waiterMan s = new waiterMan();
			frame.dispose();
		}
		if(e.getSource() == chef){
			chef s = new chef();
			frame.dispose();
		}
		if(e.getSource() == returnOut){
			system s = new system();
			frame.dispose();
		}
	}

}
