import java.util.Scanner;
public class hcfandlcm
{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        int a,b, hcf,lcm,temp;
        System.out.println("enter the two numbers");
        a=num.nextInt();
        b=num.nextInt();
        
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        hcf =a;
        System.out.println("hcf is a: "+a);
        lcm=a*b/a;
        System.out.println("lcm of two number is: " +lcm);
    }
}
