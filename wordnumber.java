import java.util.Scanner;

public class wordnumber {
    public static void main(String[] args) {
        String sagar;
        Scanner sc = new Scanner(System.in);
        System.out.println("type a sentence");
        sagar = sc.nextLine();
        String[] askar = sagar.split(" ");

        int count = askar.length;
        System.out.println(askar.length);
        sc.close();
    }

}
