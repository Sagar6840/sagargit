public class max 
{
public static void main(String[] args)
{
    int[] num = {1, 1, 0, 1, 1, 1}; 

     int max = 0;

     int now = 0;   

    for (int i = 0; i < num.length; i++)
         
    {
     if (num[i] == 1)
             {
            
                now++;
            } 
            else
            {
             
                max= Math.max(max, now);
                now = 0;
            }
        }
                  max = Math.max(max,now);

        
        System.out.println("Maximum consecutive ones: " + max);

    }
}

