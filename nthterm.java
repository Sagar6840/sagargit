import java.util.Scanner;
public class  nthterm
{
public static void main(String[] args)

{
    int a1,a2 ,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a1");
a1=sc.nextInt();
System.out.println("enter the value of a2");
a2=sc.nextInt();
System.out.println("enter the nth value");
n=sc.nextInt();
int d=a2-a1;
int nth=a1+(n-1)*d;
System.out.println(nth);

}
}
