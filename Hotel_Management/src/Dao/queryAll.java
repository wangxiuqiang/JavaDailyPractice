package Dao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class queryAll implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					queryAll window = new queryAll();
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
	public queryAll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u623F\u95F4\u7684\u4F7F\u7528\u4FE1\u606F");
		label.setBounds(120, 12, 216, 38);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setBounds(280, 239, 73, 23);
		frame.getContentPane().add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 55, 296, 168);
		frame.getContentPane().add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
