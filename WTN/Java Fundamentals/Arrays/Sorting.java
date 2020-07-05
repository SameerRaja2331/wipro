import java.util.Arrays;   

class Sorting
{ 
    public static void main(String args[])
    {
       //In a situation, where the size of the array and variables of array are already known, array literals can be used. 

       int[] arr = new int[]{ 12,25,1,99,23,31,108 };    // Declaring array literal
       int len=arr.length;
       Arrays.sort(arr);    //sorting the array.

       for(int i=0;i<len;i++)
            System.out.println(arr[i]+"   ");
    }
}