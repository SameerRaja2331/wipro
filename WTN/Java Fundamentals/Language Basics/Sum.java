//The passed information is stored as a string array in the main method in command line arguments.
//if we want to add two numbers which are sent as input, then we have to convert them into integers using ParseInt.

class Sum
{
   public static void main(String args[])
    {
       int x = Integer.parseInt(args[0]);
       int y = Integer.parseInt(args[1]);
       System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+(x+y));
     }
}