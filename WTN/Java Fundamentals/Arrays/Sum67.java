class Sum67
{
    public static void main(String args[])
     {
       int[] arr = new int[] {7,1,2,3,6};
       int temp1=0,temp2=0;
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
            if(arr[i]==6)
               temp1=i;

            if(arr[i]==7)
	temp2=i;
        }

       if(temp1<temp2)
        {
          for(int i=0;i<temp1;i++)
               sum=sum+arr[i];

         for(int i=temp2+1;i<arr.length;i++)
              sum=sum+arr[i];
         }
       else
        {
         for(int i=0;i<arr.length;i++)
                  sum=sum+arr[i];
       }

       System.out.println(sum);
   }
}