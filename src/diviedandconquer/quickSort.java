package diviedandconquer;

public class quickSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public  static void quickSort(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int pIdx = partition (arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, si, pIdx+1, ei);
    }
    
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j= si; j<ei;j++){
            if(arr[j]<= pivot){
              i++;
              
            }
        }
    }
}
ad  