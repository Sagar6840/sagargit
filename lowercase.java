public class lowercase 
{
    public static void main(String[] args)
    {
    String c="sagarpatil";
    System.out.println("converted string: ");
    for(int i=0;i<c.length(); i++)
    {
     char cr= c.charAt(i);
     if(cr>='a' && cr<='z')
      {
         char uppercase =(char) (cr-32);
         System.out.println(uppercase);
      }
     else
     {
             System.out.println(cr);
     }
    } 
     
    }
}
