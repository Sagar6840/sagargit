import java.util.Scanner;
public  class Main
{
   public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        
        int n = scanner.nextInt();
        

        double sqrt = Math.sqrt(n);
        
        if (sqrt == (int) sqrt)
        {
    
            System.out.println("The square root of " + n + " is " + (int) sqrt);
        }
        else
        {
            System.out.println(n + " is not a perfect square.");
        }
    }
}
