public class q35 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < mid) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
