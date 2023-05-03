import java.util.Arrays;

/**
 * cyclicshort
 */
public class cyclicshort {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        int[] ans = cyclee(arr);
        System.out.print(Arrays.toString(ans));
    }

    static int[] cyclee(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}