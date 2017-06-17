package com.a;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ParameterUtil {

	private JFrame frame;
	private JTextField F3;
	private JTextField F1;
	private JTextField F2;
	private JTextField F4;
	private JTextField F5;
	private JTextField F6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParameterUtil window = new ParameterUtil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParameterUtil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("故障诊断");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblt = new JLabel("冷却液温度");
		lblt.setBounds(20, 50, 150, 13);
		frame.getContentPane().add(lblt);
		
		JLabel lblp = new JLabel("水泵压力");
		lblp.setBounds(20, 80, 93, 22);
		frame.getContentPane().add(lblp);
		
		JLabel lblp_1 = new JLabel("气缸压缩压力");
		lblp_1.setBounds(20, 110, 121, 22);
		frame.getContentPane().add(lblp_1);
		
		JLabel lbll = new JLabel("气温器主阀门间隙");
		lbll.setBounds(20, 140, 111, 27);
		frame.getContentPane().add(lbll);
		
		JLabel lbll_1 = new JLabel("水泵轴与叶轮间隙");
		lbll_1.setBounds(20, 170, 112, 13);
		frame.getContentPane().add(lbll_1);
		
		JLabel label_2 = new JLabel("风扇传功带偏移量");
		label_2.setBounds(20, 200, 113, 13);
		frame.getContentPane().add(label_2);
		
		F3 = new JTextField();
		F3.setBounds(143, 110, 100, 20);
		frame.getContentPane().add(F3);
		F3.setColumns(10);
		
		F1 = new JTextField();
		F1.setBounds(143, 50, 100, 20);
		frame.getContentPane().add(F1);
		F1.setColumns(10);
		
		F2 = new JTextField();
		F2.setBounds(143, 80, 100, 20);
		frame.getContentPane().add(F2);
		F2.setColumns(10);
		
		F4 = new JTextField();
		F4.setBounds(143, 140, 100, 20);
		frame.getContentPane().add(F4);
		F4.setColumns(10);
		
		F5 = new JTextField();
		F5.setBounds(143, 170, 100, 20);
		frame.getContentPane().add(F5);
		F5.setColumns(10);
		
		F6 = new JTextField();
		F6.setBounds(143, 200, 100, 20);
		frame.getContentPane().add(F6);
		F6.setColumns(10);
		
		JButton Start = new JButton("开始");
		Start.setBounds(311, 60, 104, 23);
		frame.getContentPane().add(Start);
		
		JButton Stop = new JButton("暂停");
		Stop.setBounds(311, 120, 104, 23);
		frame.getContentPane().add(Stop);
		
		JButton Exit = new JButton("退出");
		Exit.setBounds(311, 183, 104, 23);
		frame.getContentPane().add(Exit);
	}

}
