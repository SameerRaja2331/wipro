class Palindrome
{
    public static void main(String args[])
     {
        String x = args[0];
        int len = x.length();
        String pal="";

        for (int i=len-1;i>=0;i--)
        {
           pal=pal+x.charAt(i);
         }

       if(x.equals(pal))
          System.out.println(x+" is a palindrome");
       else
         System.out.println(x+" is not a palindrome");
     }
}