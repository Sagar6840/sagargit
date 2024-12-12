
import java.util.Scanner;
public class replace 
{
    public static void main(String[] args)
    {
        System.out.println( "type  a string whatever you want"); 
     Scanner SC= new Scanner(System.in);
     String sagar=SC.nextLine();
     String remove = sagar.replace(" ","");
     System.out.println(remove);
    }

    
}
