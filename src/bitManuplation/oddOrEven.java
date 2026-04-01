package bitManuplation;

import  java.util.*;

public class oddOrEven {
    public  static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0){
//         even number
            System.out.println("even no");

        }
        else {
            System.out.println("odd no");
        }
    }
    public  static  int getItBIt(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return  0;

        } else {
            return  1;
        }
    }
    public static void main(String[] args) {

        System.out.println(getItBIt(10,2));

    }
}
