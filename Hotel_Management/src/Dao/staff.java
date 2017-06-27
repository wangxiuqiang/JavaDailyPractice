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
		
		JLabel staffLabel = new JLabel("Ա������");
		staffLabel.setBounds(160, 24, 132, 43);
		staffLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(staffLabel);
		
		waiter = new JButton("����Ա����");
		waiter.setBounds(160, 77, 132, 31);
		frame.getContentPane().add(waiter);
		waiter.addActionListener(this);//��Ӽ�����
		
		chef = new JButton("��ʦ����");
		chef.setBounds(160, 134, 132, 31);
		frame.getContentPane().add(chef);
		chef.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("����");
		returnOut.setBounds(160, 191, 132, 31);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
		
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
