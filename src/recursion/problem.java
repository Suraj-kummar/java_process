package recursion;


//  print numbers from n to 1 ( Decreasing Order) .... RECURSSION
public class problem {

    public  static void printInc(int n) {
        if(n == 1){
         System.out.print(n+ " ");
         return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    public static void main(String[] args) {

        int n = 11;
        printInc(n);
    }
    
}
