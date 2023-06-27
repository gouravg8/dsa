public class SearchBinary4AccDeAss {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 9, 12, 14, 15, 25, 36, 46, 58, 68 };
        // int[] arr = { 68, 58, 46, 36, 25, 15, 14, 12, 9, 7, 6, 5, 4, 1 };
        int target = 12;
        int ans = search(arr, target);
        System.out.println("Elem found at index: " + ans);
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (isAsc(arr)) {
            System.out.println("Array is accending");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr.length == 0)
                    return -1;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else {
            System.out.println("Array is DeAccending");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr.length == 0)
                    return -1;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }

    static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            return true;
        }
        return false;
    }
}
