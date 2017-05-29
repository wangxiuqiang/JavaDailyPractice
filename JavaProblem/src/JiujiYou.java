import java.util.Scanner;

public class JiujiYou {

  
        public static void main(String[] args) {  
           Scanner input=new Scanner(System.in);  
            int t=input.nextInt();  
            while(t-->0){  
                String str=input.next();  
                String a="cRazY";  
                String b="CraZy";  
                String t1=str.replace(a,"CrAZy");  
                t1=t1.replace(b, "cRAzY");  
                System.out.println(t1);  
            }  
       
        }  
}
      
    

