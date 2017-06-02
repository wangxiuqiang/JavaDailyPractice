package com.a;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Shape;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;

import org.w3c.dom.events.MouseEvent;

public class LP  implements MouseListener,MouseMotionListener{
           JButton button;
           int a,b,x0,y0,x,y;
	    LP()
	    {
	    	
	    }
	    /**
	     * a b 获取拖动后 在框中的位置
	     * x y 记录在事件源中的位置   相加
	     * 减去原来记录的x0 y0 用setLocation 重新定位
	     */
		public void mouseDragged(java.awt.event.MouseEvent e) {
			Component com=null;
			if(e.getSource() instanceof Component){
				com=(Component)e.getSource();
				a=com.getBounds().x;
				b=com.getBounds().y;
				x=e.getX();
				y=e.getY();
				a=a+x;b=y+b;
				com.setLocation(a-x0, b-y0);
			}
			
		}

		
		public void mouseMoved(java.awt.event.MouseEvent e) {
		}

		
		public void mouseClicked(java.awt.event.MouseEvent e) {
		}
/**
 * 在事件源上按下Press 之后获取  将事件源JButton对象变成Jcomponent对象
 * 获取JButton在JFrame 中的位置
 * 同时x0 y0 记录开始的事件源开始的位置
 */
		
		public void mousePressed(java.awt.event.MouseEvent e) {
			JComponent com=null;
			com=(JComponent)e.getSource();
//			setLayer(com, JLayeredPane.DRAG_LAYER);
//			a=com.getBounds().x;
//			b=com.getBounds().y;// 完全没用到
			x0=e.getX();
			y0=e.getY();
		}

		
		public void mouseReleased(java.awt.event.MouseEvent e) {
//			JComponent com=null;
//			com=(JComponent)e.getSource();
//			setLayer(com, JLayeredPane.DEFAULT_LAYER);
		}

		
		public void mouseEntered(java.awt.event.MouseEvent e) {
		}

		
		public void mouseExited(java.awt.event.MouseEvent e) {	
		}
}
