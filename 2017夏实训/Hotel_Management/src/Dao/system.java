package Dao;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class system implements ActionListener{

	private JFrame frame;


	public system() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel systemLabel = new JLabel("餐厅管理系统");
		systemLabel.setBounds(134, 23, 201, 34);
		systemLabel.setFont(new Font("楷体", Font.BOLD, 29));
		frame.getContentPane().add(systemLabel);
		
	    staff = new JButton("员工管理");
		staff.setBounds(81, 140, 93, 23);
		frame.getContentPane().add(staff);
		staff.addActionListener(this);//��Ӽ�����
		
	    member = new JButton("会员管理");
		member.setBounds(259, 80, 93, 23);
		frame.getContentPane().add(member);
		member.addActionListener(this);//��Ӽ�����
		
		food = new JButton("菜品管理");
		food.setBounds(259, 140, 93, 23);
		frame.getContentPane().add(food);
		food.addActionListener(this);//��Ӽ�����
		
		restaurant = new JButton("餐厅管理");
		restaurant.setBounds(81, 80, 93, 23);
		frame.getContentPane().add(restaurant);
		restaurant.addActionListener(this);//��Ӽ�����
		
		checkOut = new JButton("结账");
		checkOut.setBounds(81, 192, 93, 23);
		frame.getContentPane().add(checkOut);
		checkOut.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("退出");
		returnOut.setBounds(259, 192, 93, 23);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
	}

	JButton staff;
	JButton member;
	JButton food;
	JButton restaurant;
	JButton checkOut;
	JButton returnOut;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == staff){
			staff s = new staff();
			frame.dispose();
		}
		if(e.getSource() == food){
			
		}
		if(e.getSource() == member){
			member s = new member();
			frame.dispose();
		}
		if(e.getSource() == restaurant){
			HouseManagement s = new HouseManagement();
			frame.dispose();
		}
		if(e.getSource() == checkOut){
			memberFinally s = new memberFinally();
			frame.dispose();
		}
		if(e.getSource() == returnOut){
			frame.dispose();
		}
		if(e.getSource() == food){
			food f = new food();
			frame.dispose();
		}
		if(e.getSource() == checkOut){
			
		}
	}

}
