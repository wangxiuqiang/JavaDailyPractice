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
		foodLabel.setFont(new Font("楷体", Font.BOLD, 29));
		frame.getContentPane().add(foodLabel);
		
		addCai = new JButton("添加菜品");
		addCai.setBounds(56, 62, 119, 28);
		frame.getContentPane().add(addCai);
		addCai.addActionListener(this);//��Ӽ�����
		
		addJiu = new JButton("添加酒品ˮ");
		addJiu.setBounds(245, 62, 119, 28);
		frame.getContentPane().add(addJiu);
		addJiu.addActionListener(this);//��Ӽ�����
		
		reviseCai = new JButton("修改菜品");
		reviseCai.setBounds(56, 119, 119, 28);
		frame.getContentPane().add(reviseCai);
		reviseCai.addActionListener(this);//��Ӽ�����
		
		reviseJiu = new JButton("修改酒水");
		reviseJiu.setBounds(245, 122, 119, 28);
		frame.getContentPane().add(reviseJiu);
		reviseJiu.addActionListener(this);//��Ӽ�����
		
		chaXu = new JButton("查询菜单");
		chaXu.setBounds(56, 186, 119, 28);
		frame.getContentPane().add(chaXu);
		chaXu.addActionListener(this);//��Ӽ�����
		
		returnOut = new JButton("返回");
		returnOut.setBounds(245, 186, 119, 28);
		frame.getContentPane().add(returnOut);
		returnOut.addActionListener(this);//��Ӽ�����
	}

	JButton returnOut;
	JButton chaXu;
	JButton reviseJiu;
	JButton reviseCai;
	JButton addJiu;
	JButton addCai;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == returnOut){
		system s = new system();
			frame.dispose();
		}
		if (e.getSource() == chaXu) {
			queryMenu q  = new queryMenu();
			frame.dispose();
		}
		if (e.getSource() == reviseCai) {
			foodChange f = new foodChange();
			frame.dispose();
		}
		if (e.getSource() == reviseJiu) {
			wineChange f = new wineChange();
			frame.dispose();
		}
		if (e.getSource() == addCai) {
			foodAdd f = new foodAdd();
			frame.dispose();
		}
		if (e.getSource() == addJiu) {
			wineAdd f = new wineAdd();
			frame.dispose();
		}
		
	}

}
