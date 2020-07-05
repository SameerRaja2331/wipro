//import java.util.Arrays;   

import java.util.*;

class Max2Min2
{ 
    public static void main(String args[])
    {
       //In a situation, where the size of the array and variables of array are already known, array literals can be used. 

       int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };    // Declaring array literal
       int len=arr.length;
       Arrays.sort(arr);    //sorting the array.
      System.out.println("First Maximum value = "+arr[len-1]);
      System.out.println("Second Maximum value = "+arr[len-2]);
      System.out.println("First Minimum value = "+arr[0]);
      System.out.println("Second Minimum value = "+arr[1]);
    }
}