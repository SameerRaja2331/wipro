class Only14
{
      public static void main(String args[])
       {
         int[] arr = new int[] {1,4,2,4};
         int flag=1;
         for(int i=0;i<arr.length;i++)
         {
           if(arr[i]!=1 || arr[i]!=4)
            {
              flag=0;
              break;
             }
          }
      
         if(flag==1)
            System.out.println("True");
         else
            System.out.println("False");
       }
}