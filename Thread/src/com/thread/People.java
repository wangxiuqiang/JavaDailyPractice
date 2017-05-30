package com.thread;

public class People extends Thread{
     public StringBuffer str;
     public People(String s,StringBuffer str) {
		setName(s);
		this.str=str;
	}
     public void run(){
    	 for(int i=1;i<=3;i++){
    		 str.append(getName()+",");
    		 System.out.println("我是"+getName()+",字符串为"+str);
    		 try{
    			 sleep(500);
    		 }
    		 catch (Exception e) {
				// TODO: handle exception
			}
    	 }
     }
}
