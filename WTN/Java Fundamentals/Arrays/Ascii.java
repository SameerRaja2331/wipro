class Ascii
{
   public static void main(String args[])
    {
        int[] arr=new int[]{65, 89, 48, 99, 103};
        int len=arr.length;

        for(int i=0;i<len;i++)
         {
             char b = (char)(arr[i]);
            System.out.print(b+"  ");
          }
    }
}