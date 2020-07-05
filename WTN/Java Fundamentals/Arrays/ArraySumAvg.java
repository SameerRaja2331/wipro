class ArraySumAvg
{ 
    public static void main(String args[])
    {
       //In a situation, where the size of the array and variables of array are already known, array literals can be used. 

       int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };    // Declaring array literal
       int len=arr.length;
       int sum=0;
       for(int i=0;i<len;i++)
            sum=sum+arr[i];

       int avg = sum/len;

      System.out.println("Sum = "+sum);
      System.out.println("Average = "+avg);
    }
}