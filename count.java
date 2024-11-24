public class count 
 {
    public static void main(String[] args) 
    {
        int[] arr = {10,80,20,70,80,10,100,400,10,70,100};
        
     for (int i = 0; i < arr.length; i++)
         {
    boolean yes = false; 
            
        
for (int j = 0; j < i; j++) 
 {
    if (arr[i] == arr[j]) 
                {
        yes = true;
                 break;
                }
            }
            
            
if (!yes)
             {
     int n = 1;
                
 for (int j = i + 1; j < arr.length; j++) 
                {
     if (arr[i] == arr[j])
        {
      n++;
     }
}
 System.out.println(arr[i] + " " + n);
            }
        }
    }
}

    
