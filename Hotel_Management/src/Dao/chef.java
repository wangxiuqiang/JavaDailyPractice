package Dao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class chef implements ActionListener{

	private JFrame frame;

	
	public chef() {
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
		
		JLabel chefLabel = new JLabel("厨师管理");
		chefLabel.setBounds(154, 10, 155, 32);
		chefLabel.setFont(new Font("宋体", Font.BOLD, 29));
		frame.getContentPane().add(chefLabel);
		
		add = new JButton("添加厨师");
		add.setBounds(128, 67, 181, 32);
		frame.getContentPane().add(add);
		add.addActionListener(this);//添加监视器
		
		revise = new JButton("修改厨师信息");
		revise.setBounds(128, 126, 181, 32);
		frame.getContentPane().add(revise);
		revise.addActionListener(this);//添加监视器
		
		returnOut = new JButton("返回");
		returnOut.setBounds(128, 192, 181, 32);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//添加监视器
	}

	JButton add;
	JButton revise;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			chefAdd s = new chefAdd();
			frame.dispose();
		}
		if(e.getSource() == revise){
			chefChange s = new chefChange();
			frame.dispose();
		}
		if(e.getSource() == returnOut){
			staff s = new staff();
			frame.dispose();
		}
		
	}

}
