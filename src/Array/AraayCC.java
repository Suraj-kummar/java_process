package Array;

import java.util.Scanner;

public class AraayCC {
    public static void main(String[] args) {
        int mark [] = new int [100];
        Scanner sc = new Scanner(System.in);

        mark[0] = sc.nextInt();
        mark[1] = sc.nextInt();
        mark[2] = sc.nextInt();
        mark[3] = sc.nextInt();
        System.out.println("phy : " + mark[0]);
        System.out.println("chem : " + mark[1]);
        System.out.println("math : " + mark[2]);
        System.out.println("eng : " + mark[3]);


    }
}
