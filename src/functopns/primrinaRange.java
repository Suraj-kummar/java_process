package functopns;

public class primrinaRange {
    public static boolean isprime (int n) {
        if(n==2){
            return  true;
        }
        for (int i = 2; i<=Math.sqrt(n); i++) {
if (n % i == 0) {
}
        }
        return false;
    }

    public  static  void primeinRange(int n){
        for (int i=2; i<=n; i++){
        if (isprime(i)){
            System.out.print(i+" ");
        }
    }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinRange(20);
    }

}
