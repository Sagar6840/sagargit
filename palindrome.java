import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sagar = new Scanner(System.in);

        System.out.print("input as number: ");
        int number = sagar.nextInt();
        String n = String.valueOf(number);
        String r = " ";


        for (int i = n.length() - 1; i >= 0; i--)
        {
            r+= n.charAt(i);
        }


        boolean isPalindrome = n.equals(r);
        System.out.println(number + "    " + isPalindrome);


    }
}
