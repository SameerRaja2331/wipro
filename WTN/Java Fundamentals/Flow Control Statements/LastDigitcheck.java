class LastDigitcheck
{
   public static void main(String args[])
   {
     int x = Integer.parseInt(args[0]);
     int y = Integer.parseInt(args[1]);

     if(x%10==y%10)
         System.out.println("True");
     else
         System.out.println("False");	
    }
}