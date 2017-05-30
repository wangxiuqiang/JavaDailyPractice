package com.ThreadRunnable;

public class Bank implements Runnable{
       private int number=0;
       public void setMoney(int m){
    	   number = m;
       }
       public void run(){
    	   String name=Thread.currentThread().getName();
    	   if(name.equals("One")){
    		   if(number<=160){
    			   System.out.println(name+"进入死亡状态");
    			   return;
    		   }
    		   number=number+10;
    		   System.out.println("我是"+name+"现在的Number="+number);
    	   }
    	   if(Thread.currentThread().getName().equals("Two")){
    	       if(number<=0){
    	    	   System.out.println(name+"进入死亡状态");
    	    	   return;
    	       }
    	       number=number-100;
    	       System.out.println("我是"+name+"现在的number="+number);
    	   }
    	   try{
    		   Thread.sleep(100);
    	   }
    	   catch (Exception e) {
			// TODO: handle exception
		}
       }
}
