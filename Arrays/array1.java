package Oops.Arrays;
import java.util.*;


/*Take an array as input from the user.Search for a given number x 
   and print the index at which it occurs.*/

public class array1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        //input
        for(int i=0; i<size; i++)
        {
            array[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        
        //output
        for(int i=0; i<array.length; i++)
        {
            if(array[i] == x){
                System.out.println("x found at index: "+ i );
            }
            
        }
    }
}
