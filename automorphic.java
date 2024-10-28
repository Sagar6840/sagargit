import java.util.Scanner;

public class automarphic
{
    public static void main(String[] args)
    {
    Scanner sgr = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number = sgr.nextInt();
    int square = number * number
    int temp = number;

 while (temp > 0)
  {
    if (square % 10 != temp % 10)
     {
       System.out.println("  not automorphic number:" +number);
            return;
     }
     else
     {
        square /= 10;
        temp /= 10;
       }

     System.out.println(" automorphic number: " +number);
  }
}

}