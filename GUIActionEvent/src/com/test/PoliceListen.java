package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class PoliceListen implements ActionListener{
      JTextField text;
      public void setJTextField(JTextField text){
    	  this.text=text;
      }
      public void actionPerformed(ActionEvent e){
    	  int n=0,m=0;
    	  JTextField textSource=(JTextField) e.getSource();
    	  String str=textSource.getText();
    	  if(!str.isEmpty()){
    		  try{
    			  n=Integer.parseInt(str);
    			  m=n*n;
    			  text.setText(""+m);
    		  }
    		  catch(Exception e1){
    			  textSource.setText("请输入数字");
    		  }
    	  }
      }
}
