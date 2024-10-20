import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        System.out.println("Multiplication table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }


        System.out.println("\nReverse order:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num * i);
        }

        // Close the scanner
        scanner.close();
    }
}