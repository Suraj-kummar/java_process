package Array;
import  java.util.*;
public class largestNumber {
    public static int grtLargest (int numbers[]) {
     int largest = Integer.MIN_VALUE;

     for (int i=0; i<numbers.length; i++) {
         if ( largest < numbers[i]){
             largest = numbers[i];
         }
        }
     return largest;

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,3,5,6,7,};
        System.out.println("largest values is : " + grtLargest(numbers));
    }
    
}
