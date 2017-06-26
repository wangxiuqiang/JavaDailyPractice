package Dao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class food {

	private JFrame frame;

	
	public food() {
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
		frame.setVisible(true);
		JLabel foodLabel = new JLabel("��Ʒ����");
		foodLabel.setBounds(161, 23, 143, 34);
		foodLabel.setFont(new Font("����", Font.BOLD, 29));
		frame.getContentPane().add(foodLabel);
		
		JButton addCai = new JButton("��Ӳ�Ʒ");
		addCai.setBounds(56, 62, 119, 28);
		frame.getContentPane().add(addCai);
		
		JButton addJiu = new JButton("��Ӿ�ˮ");
		addJiu.setBounds(245, 62, 119, 28);
		frame.getContentPane().add(addJiu);
		
		JButton reviseCai = new JButton("�޸Ĳ�Ʒ");
		reviseCai.setBounds(56, 119, 119, 28);
		frame.getContentPane().add(reviseCai);
		
		JButton reviseJiu = new JButton("�޸ľ�ˮ");
		reviseJiu.setBounds(245, 122, 119, 28);
		frame.getContentPane().add(reviseJiu);
		
		JButton chaXu = new JButton("��ѯ�˵�");
		chaXu.setBounds(56, 186, 119, 28);
		frame.getContentPane().add(chaXu);
		
		JButton returnOut = new JButton("����");
		returnOut.setBounds(245, 186, 119, 28);
		frame.getContentPane().add(returnOut);
	}

}
