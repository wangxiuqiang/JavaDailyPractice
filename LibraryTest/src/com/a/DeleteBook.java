package com.a;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DeleteBook extends JFrame implements MouseListener{

    JButton deleteBook ;
    JTextField idDecide,idInput;
    public DeleteBook(){
    	init();
    	setTitle("删除书籍");
    	setVisible(true);
    	setBounds(100,100,500,300);
    }
	public void init(){
		setLayout(null);
		deleteBook=new JButton("确认删除");
        deleteBook.setBounds(290,100,90,28);
		idDecide=new JTextField();
	    idDecide.setEditable(false);
	    idDecide.setBounds(30, 60, 250, 25);
	    idDecide.setFont(new Font("楷体", Font.BOLD, 20));
	    idDecide.setText("请输入要删除书籍的id:");
	    idInput=new JTextField();
	    idInput.setBounds(290, 60,60, 25);
	    add(deleteBook);
	    add(idDecide);
	    add(idInput);
	}
	
	public void mouseClicked(MouseEvent e) {
          /*
           * 添加函数当点击删除的时候,数据库中的内容被删除
           */
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
       
}
