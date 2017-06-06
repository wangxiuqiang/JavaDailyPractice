package com.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeBook implements MouseListener{
    /**
     * 显示不出来   JFrame   修改  
     */
	public   JFrame changeBook;
         JButton changeOk,changeFirst;
          public ChangeBook(){
        	 changeBook=new JFrame("修改图书");
        	 init();
        	 changeBook .setVisible(true);
        	 changeBook.setBounds(100,100,500,300);
         }
         public void init(){
        	 changeBook.setLayout(null);
        	 changeFirst=new JButton("确认");
        	 changeFirst.setBounds(10,50,60,30);
        	 changeOk=new JButton("修改");
        	 changeOk.setBounds(15, 100, 60, 30);
        	 changeBook.add(changeFirst);
        	 changeBook.add(changeOk);
         }
		
		public void mouseClicked(MouseEvent e) {
		}
		
		public void mousePressed(MouseEvent e) {
		}
	
		public void mouseReleased(MouseEvent e) {
		}
		
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}
