package Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class queryMenu extends JFrame implements ActionListener {
	public queryMenu() {
		getContentPane().setLayout(null);

		JLabel head = new JLabel("菜单详情");
		head.setBounds(155, 33, 200, 36);
		head.setFont(new Font("楷体", Font.BOLD, 33));
		getContentPane().add(head);

		textArea = new JTextArea();
		textArea.setBounds(82, 90, 314, 129);
		getContentPane().add(textArea);

		button = new JButton("\u8FD4\u56DE");
		button.setBounds(334, 245, 67, 23);
		getContentPane().add(button);
	}

	JButton button;
	JTextArea textArea;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			food f = new food();
			this.dispose();
		}
	}
}
