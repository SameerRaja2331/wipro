class Present
{
   public static void main(String args[])
    {
      int[] arr = new int[] {1,4,34,56,7};
      int x=90;
      int flag=1;
      int l = 0, r = arr.length - 1; 
      while (l <= r) 
     { 
         int m = l + (r - l) / 2; 
        // Check if x is present at mid 
        if (arr[m] == x) 
         {
                flag=0;
	System.out.println(m); 
         }

        // If x greater, ignore left half 
        if (arr[m] < x) 
	l = m + 1; 
        // If x is smaller, ignore right half 
          else
	r = m - 1;
     }

    if(flag==1)
          System.out.println("-1");
  }
}