/**
 * dsa
 */
public class dsa {

    public static void main(String[] args) {
        int[] arr = { 1, 54, 2, 6, 23, 754, 634, 5, 23 };
        int target = 54;
        // boolean ans = present(arr, target);
        boolean ans = present2(arr, target, 0, 7);
        if (ans) {
            System.out.println("yes");
        } else {
            System.out.println("koni");
        }
        // System.out.print(Arrays.toString(arr));
    }

    static boolean present(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // for (int i : arr) {
            // }
            if (arr[i] != target) {
                return false;
            }
        }
        return true;
    }

    static boolean present2(int[] arr, int target, int start, int end) {
        for (int j = 0; j < arr.length;) {
            if (arr[j] == target) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}