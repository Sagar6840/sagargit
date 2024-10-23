

import java.util.Scanner;

public class ArmstrongNumber
 {
    public static void main(String[] args) {
        Scanner sagar = new Scanner(System.in);

    
        System.out.print("Enter the range (two numbers): ");
        int a = sagar.nextInt();
        int b = sagar.nextInt();

        System.out.print("The Armstrong numbers between " + a + " and " + b + " are: ");
        for (int i = a; i <= b; i++)
        
        {
            if (isArmstrong(i)) 
            {
                System.out.print(i + " ");
            }
        }
        
    }


    public static boolean isArmstrong(int number)
     {
        int sum = 0;
        int digits = 0;
        int temp = number;

        
        while (temp != 0) 
        {
            temp /= 10;
            digits++;
        }

        temp = number;

        while (temp != 0)
         {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number; 
    }
}
