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
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel staffLabel = new JLabel("员工管理");
		staffLabel.setBounds(160, 24, 132, 43);
		staffLabel.setFont(new Font("楷体", Font.BOLD, 29));
		frame.getContentPane().add(staffLabel);
		
		waiter = new JButton("服务员管理");
		waiter.setBounds(160, 77, 132, 31);
		frame.getContentPane().add(waiter);
		waiter.addActionListener(this);//��Ӽ�����
		
		chef = new JButton("厨师管理");
		chef.setBounds(160, 134, 132, 31);
		frame.getContentPane().add(chef);
		chef.addActionListener(this);//��Ӽ�����
		chaXu = new JButton("查询");
		chaXu.setBounds(160, 191, 132, 31);
		frame.getContentPane().add(chaXu);
		chaXu.addActionListener(this);//��Ӽ�����
		returnOut = new JButton("返回");
		returnOut.setBounds(160, 242, 132, 31);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
		
	}

	
	JButton waiter,chaXu;
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
		if (e.getSource() == chaXu) {
			queryChefAndWaiter q = new queryChefAndWaiter();
			frame.dispose();
		}
	}

}
