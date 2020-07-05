class UpperLower
{
   public static void main(String args[])
   {
     char x = 'o';
    //In order to use toLowerCase or toUpperCase our variable must be of type string. So,we are converting to string here. 

     String y = Character.toString(x);   
     if(x>='A' &&  x<='Z')
          System.out.println(x+"->"+y.toLowerCase());
     else
          System.out.println(x+"->"+y.toUpperCase());
    }
}