import java.util.Scanner;
public class sp
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the two integer values: ");
    int a,b,i;

    a=sc.nextInt();
    b=sc.nextInt();

    System.out.println("Prime numbers between " + a + " and " + b + " : ");


    for (int n = a; n<= b; n++)
    {
      if (n < 2)
        continue;


      for ( i = 2; i <= Math.sqrt(n); i++)
      {
        if (n % i == 0)
        {
          System.out.println("not prime: " +n);
          break;
        }
      }


      if (  i > Math.sqrt(n))
      {
        System.out.println(n+" is prime");
      }

    }
  }

}  