import  java.util.*;
public class nestedLoop {
//    PRINT STAR PATTERN
public static void main(String[] args) {
//    OUTER LINE
    for(int line=1; line<=4; line++){
     for(int star=1; star<=line; star++){
         System.out.print("*");
     }
        System.out.println();
    }
}

}
