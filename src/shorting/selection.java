package shorting;

public class selection {

    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void selectionSort (int arr []){
        for (int i=0; i<arr.length-1; i++){
            int minPos = 1;
            for (int j=i+1; j<arr.length-1; j++) {
                if (arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
//             swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }


    public static void main(String[] args) {
        int arr [] = {5,6,2,4,3,7,1};
        selectionSort(arr);
        printArr(arr);

    }
}
