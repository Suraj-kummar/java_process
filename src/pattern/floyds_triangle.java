package pattern;

public class floyds_triangle {

    public static void floyds_traingles(int n) {
//         outer
        int counter = 1;
        for (int i = 1; i<= n; i++) {
//  ineer - how many times will counter be printed
 for (int j=1; j<=i; j++) {
     System.out.print(counter+" ");
     counter++;
 }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        floyds_traingles(5);
    }
}
