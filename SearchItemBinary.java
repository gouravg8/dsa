/**
 * SearchItemBinary
 */
public class SearchItemBinary {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 34, 56, 77, 88, 97, 102, 129, 434, 2330 };
        int target = 97;
        // ///////////searching for normal condition////////
        // int ans = search(arr, target);
        // System.out.print("Element is found at index: " + ans);
        ////////////// searching under the condition of given range
        /////////////
        int start = 3, end = 9;
        int ans = search2(arr, target, start, end);
        System.out.print("Element is found at index: " + ans);
        // System.out.print(arr.length - 1);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.length == 0) {
                return -1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // return mid;
        return -1;
    }

    static int search2(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.length == 0) {
                return -1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // return mid;
        return -1;
    }
}