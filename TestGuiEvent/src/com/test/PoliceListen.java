package com.test;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

public class PoliceListen implements ActionListener{
      JTextField text;
      public String driver="com.mysql.jdbc.Driver";
      public String user="root";
      public String password="root";
      public String url="jdbc:mysql://localhost:3306/Library";
      public void actionPerformed(ActionEvent e){
    	 JTextField textSource=(JTextField) e.getSource();
    	 String str=textSource.getText();
    	 int n=0;
    	 if(!str.isEmpty()){
    	  try {
    		  n=Integer.parseInt(str);
    		 String name = null;
			Class.forName(driver);
			Connection connection=DriverManager.getConnection(url, user, password);
			String sql="SELECT name FROM student WHERE id="+n;
			Statement statement=connection.createStatement();
			ResultSet rSet=statement.executeQuery(sql);
			while(rSet.next()){
				name=rSet.getString(1);
			}
			text.setText(name);
		} catch (Exception e1) {
		
		}
		
    	 } 
      }
	public void setJTestField(JTextField text) {
		this.text=text;	
	}
      
}
