package com.Mouse;

import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MousePolice implements MouseListener{
         JTextArea textArea;
         public void setJTextArea(JTextArea textArea){
        	 this.textArea=textArea;
         }
         public void mousePressed(MouseEvent e){
        	 textArea.append("\n鼠标按下,位置:"+"("+e.getX()+","+e.getY()+")");
         }
         public void mouseReleased(MouseEvent e){
        	 textArea.append("\n鼠标释放,位置:"+"("+e.getX()+","+e.getY()+")");
         }
		
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getClickCount()>=2){
				 textArea.append("\n鼠标连击,位置:"+"("+e.getX()+","+e.getY()+")");
			}
		}
	
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() instanceof JButton){
				 textArea.append("\n鼠标进入按钮,位置:"+"("+e.getX()+","+e.getY()+")");
			}
			if(e.getSource() instanceof JTextField){
				 textArea.append("\n鼠标进入文本框,位置:"+"("+e.getX()+","+e.getY()+")");
			}
			if(e.getSource() instanceof JFrame){
				 textArea.append("\n鼠标进入窗口,位置:"+"("+e.getX()+","+e.getY()+")");
			}
		}
	
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			 textArea.append("\n鼠标退出,位置:"+"("+e.getX()+","+e.getY()+")");
		}
}
