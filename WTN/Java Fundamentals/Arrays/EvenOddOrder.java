class EvenOddOrder
{
     public static void main(String args[])
     {
        int[] arr = new int[] {1, 0, 1, 0, 0, 1, 1};
        int len=arr.length;
        int array[] = new int[len];
        int cnt=0;
       for(int i=0;i<len;i++)
       {
            if(arr[i]%2==0)
             {
               array[cnt]=arr[i];
               cnt=cnt+1;
              }
         }

       for(int i=0;i<len;i++)
       {
            if(arr[i]%2!=0)
             {
               array[cnt]=arr[i];
               cnt=cnt+1;
              }
         }   
        
      for(int i=0;i<array.length;i++)
      {
        System.out.print(array[i] +"   ");
      }

     }     
}