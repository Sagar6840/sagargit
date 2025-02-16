import java.util.Scanner;

public class checkupperorlowercase 
{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      char ch= sc.next().trim().charAt(0);
    
     if(ch >='A'&& ch <='Z')
     {
      System.out.println("uppercase");
     }
     else{

     
      System.out.println("lowercase");
     }
     
    }
}
