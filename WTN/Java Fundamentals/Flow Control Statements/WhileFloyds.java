class WhileFloyds
{
    public static void main(String args[])
     {
        if(args.length!=0)
         {
                int n = Integer.parseInt(args[0]);
                int i=1;
                while(i<=n)
	 {
	    int j=i;
                    while(j!=0)
                     {
                       System.out.print("*   ");
	       j=j-1;
                      }
                   System.out.println();
                   i=i+1;
	 }
        }
       else
          System.out.println("Please enter an integer number");
   }
}