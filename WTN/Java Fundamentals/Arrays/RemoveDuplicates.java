import java.util.*;
 
class RemoveDuplicates
{
    public static void main(String[] args) 
    {
        //Array with duplicate elements
        Integer[] numbers = new Integer[] {12,34,12,45,67,89};
    
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}