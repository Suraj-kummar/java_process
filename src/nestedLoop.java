import  java.util.*;
public class nestedLoop {

////    PRINT STAR PATTERN
//public static void main(String[] args) {
////    OUTER LINE
//    for(int line=1; line<=4; line++){
//     for(int star=1; star<=line; star++){
//         System.out.print("*");
//     }
//        System.out.println();
//    }
//}



////     PRINT INVERTED-STAR PATTERN
//public static void main(String[] args) {
//    int n =4;
//    for (int line=1; line <=4; line++){
//        for(int star=1; star<=4-line+1; star++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//}


////     HALF PYRAMID PATTERN
//public static void main(String[] args) {
//    int n= 4;
//    for (int i=1; i<=n; i++){
//        for (int j=1; j<=i; j++){
//            System.out.print(j);
//
//        }
//        System.out.println();
//    }
//}


//     PRINT CHARACTER PATTERN
public static void main(String[] args) {
    int n =4;
    char ch = 'A';
//    outer loops
    for (int line=1; line<=n; line++) {
//    inner loop
        for (int chars = 1; chars <= line; chars++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
}
