import java.util.Arrays;   

class MaxMin
{ 
    public static void main(String args[])
    {
       //In a situation, where the size of the array and variables of array are already known, array literals can be used. 

       int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };    // Declaring array literal
       int len=arr.length;
       Arrays.sort(arr);    //sorting the array.
      System.out.println("Maximum value = "+arr[len-1]);
      System.out.println("Minimum value = "+arr[0]);
    }
}