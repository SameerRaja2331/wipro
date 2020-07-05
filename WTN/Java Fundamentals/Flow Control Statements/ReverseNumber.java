import java.util.*;

class ReverseNumber
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       String rev ="";
       while(x!=0)
        {
          rev=rev+Integer.toString(x%10);
          x=x/10;
        }
       System.out.println(rev);
     }
}