package Array;
 import java.util.*;
public class linear_search {
    public static int liner(int number [], int key) {
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int number [] = {2,3,4,5,7,10,22,11,23,34};
        int key = 10;

        int index = liner(number, key);
        if (index == -1) {
            System.out.println("NNNNNOT FOUND");

        } else {
            System.out.println("key is at index: " + index);
        }
    }
}
