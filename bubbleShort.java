
import java.util.Arrays;

/**
 * bubbleShort
 */
public class bubbleShort {
    public static void main(String[] args) {
        // int[] arr = { 5, 3, 2, 4, 1 };
        int[] arr = { -1, 2, 3, -4, 5 };
        shortIt(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shortIt(int[] arr) {
        boolean swaped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap(arr, arr[j], arr[j - 1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped)
                break;
        }
    }

    // private static void swap(int[] arr, int i, int j) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // }

}