package diviedandconquer;

public class sorted&RotatedArr {   

    public static int search(int[] arr, int target, int si, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Case 1: Found target
        if (arr[mid] == target) {
            return mid;
        }
    
        // Case 2: Left half is sorted
        if (arr[si] <= arr[mid]) {

            // Target lies in left half
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } 
            // Otherwise go right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // Case 3: Right half is sorted
        else {

            // Target lies in right half
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } 
            // Otherwise go left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(arr, target, 0, arr.length - 1);

        System.out.println("Index: " + result);
    }
