package pattern;

public class hollowRecantgal {

    public static void hollow_recatangle (int totRows, int totCols) {

//         outer loops
        for(int i=1; i<=totRows ; i++){
            for( int j=1; j<= totCols; j++) {
                if (i == 1 || i == totRows || j == 1|| j == totCols){
//                    boundary cells
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       hollow_recatangle(5, 7);
    }
}
