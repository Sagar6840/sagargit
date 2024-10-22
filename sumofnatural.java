import java.util.Scanner;


public class sumofnatural
{

    public static int sumOfNaturalNumbers(int n)
    {
        return n * (n + 1) / 2;

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        int n = scanner.nextInt();

        int sum= sumOfNaturalNumbers(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
    }
}
