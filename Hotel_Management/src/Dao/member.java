package Dao;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class member implements ActionListener{

	private JFrame frame;

	
	public member() {
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
		
		JLabel memberLabel = new JLabel("会员管理");
		memberLabel.setBounds(164, 27, 136, 34);
		memberLabel.setFont(new Font("楷体", Font.BOLD, 29));
		frame.getContentPane().add(memberLabel);
		
		add = new JButton("添加会员");
		add.setBounds(45, 86, 136, 34);
		frame.getContentPane().add(add);
		add.addActionListener(this);//��Ӽ�����
		
		revise = new JButton("修改会员");
		revise.setBounds(254, 86, 136, 34);
		frame.getContentPane().add(revise);
		revise.addActionListener(this);//��Ӽ�����
		
		chaXu = new JButton("查询会员");
		chaXu.setBounds(45, 176, 136, 34);
		frame.getContentPane().add(chaXu);
		chaXu.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("返回");
		returnOut.setBounds(254, 176, 136, 34);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
	}

	JButton add;
	JButton revise;
	JButton chaXu;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			memberAdd s = new memberAdd();
			frame.dispose();
		}
		if(e.getSource() == revise){
			memberChange s = new memberChange();
			frame.dispose();
		}
		if(e.getSource() == chaXu){
			
		}
		if(e.getSource() == returnOut){
			system s = new system();
			frame.dispose();
		}
		
	}

}
