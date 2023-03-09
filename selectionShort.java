import java.util.Arrays;

public class selectionShort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        shorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - 1 - i;
            int maxIndex = findMax(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] arr, int maxIndex, int end) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }

    private static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
