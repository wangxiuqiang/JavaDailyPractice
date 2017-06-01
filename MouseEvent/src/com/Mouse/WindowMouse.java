package com.Mouse;

import java.awt.FlowLayout;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class WindowMouse extends JFrame{
	      JTextArea textArea;
          JButton button;
          JTextField text;
          MousePolice police;
          public WindowMouse() {
			// TODO Auto-generated constructor stub
		    init();
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }
          void init(){
        	  setLayout(new FlowLayout());
        	  text=new JTextField(10);
        	  textArea=new JTextArea(5,28);
        	  police=new MousePolice();
        	  police.setJTextArea(textArea);
        	  text.addMouseListener(police);
        	  button=new JButton("anniu");
              button.addMouseListener(police);
              addMouseListener(police);
              add(button);
              add(text);
              add(textArea);
          }
}
