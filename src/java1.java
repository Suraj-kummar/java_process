import  java.util.*;
public class java1 {
//    LOOP--------

//    WHILE LOOP---------
//public static void main(String[] args) {
//    int counter = 0;
//    while(counter<100){
//        System.out.println("hellow world");
//        counter++;
//    }
//    System.out.println("printed hw 100x");
//}


//    1 to n
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int range = sc.nextInt();
//        int counter = 1;
//        while (counter <= range){
//            System.out.println(counter+ " ");
//            counter++;
//        }
//        System.out.println();
//    }





//     first n natural number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i =1;
        while (i<=n){
            sum += 1;
            i++;
        }
        System.out.println("sum is : " + sum);
    }



}
