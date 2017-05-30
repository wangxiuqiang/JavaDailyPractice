package com.thread;

public class ThreadChildClass {

	public static void main(String[] args) {
		People personOne,personTwo;
		StringBuffer str=new StringBuffer();
	    personOne=new People("张三", str);
	    personTwo=new People("李四", str);
	    personOne.start();
	    personTwo.start();
	}

}
