import java.util.*;

class Multitable 
{
    public static void main(String args[])
     {
        for (int i = 1; i <= 10; i++)
         {
            int[] a={1,2,3,4,5,6,7,8,9,10};
            for (int j = 0; j < a.length; j++) 
            {
               
                System.out.println(i*a[j]); 
            }
            System.out.println();
        }
    }
}