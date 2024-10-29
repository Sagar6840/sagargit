import java.util.Scanner;
public class currency
{
  public static void main(String[] args)
  {
    System.out.println("enter currency");
    Scanner sgr=new Scanner(System.in);
    int cur=sgr.nextInt();
    double usd;
    usd=(cur/84.04);
    System.out.println("usd value is:" +usd);
  }
}