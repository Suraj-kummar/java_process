public class for_loop {

//     print Revere of a number

//    public static void main(String[] args) {
//        int n = 122334;
//
//        while(n>0){
//            int lastDigit = n % 10;
//            System.out.print(lastDigit);
//            n = n / 10;
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        int n = 1334555;
        int rev = 0;

        while (n>0) {
            int lastDigit =  n%10;
            rev =(rev*10) + lastDigit;
            n= n/10;
        }
        System.out.println(rev);
    }

}
