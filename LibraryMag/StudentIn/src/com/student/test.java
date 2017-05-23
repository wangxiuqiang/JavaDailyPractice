package com.student;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
        int xuanze=input.nextInt();
		while(xuanze==1){
			System.out.print("欢迎注册,");
			System.out.println("请输入学号:");
			int id=input.nextInt();
			System.out.println("请输入姓名:");
			String name=input.next();
			System.out.println("请输入充值金额:");
			int money=input.nextInt();
			student stu=new student(id,name,money);
			studentIn  stuIn=new studentIn();
			stuIn.studentIn(stu);
		}
	}

}
