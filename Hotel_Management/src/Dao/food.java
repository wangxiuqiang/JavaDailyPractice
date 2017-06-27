package Dao;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class food implements ActionListener{

	private JFrame frame;

	
	public food() {
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
		
		JLabel foodLabel = new JLabel("菜品管理");
		foodLabel.setBounds(161, 23, 143, 34);
		foodLabel.setFont(new Font("宋体", Font.BOLD, 29));
		frame.getContentPane().add(foodLabel);
		
		addCai = new JButton("添加菜品");
		addCai.setBounds(56, 62, 119, 28);
		frame.getContentPane().add(addCai);
		addCai.addActionListener(this);//添加监视器
		
		addJiu = new JButton("添加酒水");
		addJiu.setBounds(245, 62, 119, 28);
		frame.getContentPane().add(addJiu);
		addJiu.addActionListener(this);//添加监视器
		
		reviseCai = new JButton("修改菜品");
		reviseCai.setBounds(56, 119, 119, 28);
		frame.getContentPane().add(reviseCai);
		reviseCai.addActionListener(this);//添加监视器
		
		reviseJiu = new JButton("修改酒水");
		reviseJiu.setBounds(245, 122, 119, 28);
		frame.getContentPane().add(reviseJiu);
		reviseJiu.addActionListener(this);//添加监视器
		
		chaXu = new JButton("查询菜单");
		chaXu.setBounds(56, 186, 119, 28);
		frame.getContentPane().add(chaXu);
		chaXu.addActionListener(this);//添加监视器
		
		returnOut = new JButton("返回");
		returnOut.setBounds(245, 186, 119, 28);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//添加监视器
	}

	JButton returnOut;
	JButton chaXu;
	JButton reviseJiu;
	JButton reviseCai;
	JButton addJiu;
	JButton addCai;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == returnOut){
			index s = new index();
			frame.dispose();
		}
		
	}

}
