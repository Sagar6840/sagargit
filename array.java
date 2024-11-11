public class Main
{
    public static int findTarget(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {

        int[] arr = {1, 4, 3, 2, 6, 5};
        int target = 6;


        int result = findTarget(arr, target);


        if (result != -1)
        {
            System.out.println("Target found at index " + result + ".");
        } else
        {
            System.out.println("Target not found.");
        }
    }
}
