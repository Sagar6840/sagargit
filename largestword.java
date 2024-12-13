import java.util.Scanner;

public class largestword
 {
    public static void main(String[] args)
     {
        String largestWord = "";
        String sp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        sp = sc.nextLine();

        String[] sag = sp.split(" ");

    System.out.println("largestword:");
        for (String word : sag) 
        {
        

            largestWord = word;

        }

        System.out.println(largestWord);

        sc.close();
    }
}
