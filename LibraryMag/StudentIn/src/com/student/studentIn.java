package com.student;

import java.sql.*;

public class studentIn{
	/*
	 * 1.连接驱动
	 * 2.创建连接
	 * 3.sql语句 创建state 
	 * 添加      
	 */
	public String driver="com.mysql.jdbc.Driver";
      public String url="jdbc:mysql://localhost:3306/Library";  
      public String user="root";
      public String password="root";
      
	  void studentIn(student stu) throws Exception{
    	    Class.forName(driver);
    	    Connection studentTable=DriverManager.getConnection(url, user, password);
    	    String sql="insert into student(id,name,money) values(?,?,?)";
    	    PreparedStatement ps=studentTable.prepareStatement(sql);
    	    ps.setInt(1, stu.id);
    	    ps.setString(2, stu.name);
    	    ps.setInt(3, stu.money);
    	    ps.executeUpdate();
      }
}
