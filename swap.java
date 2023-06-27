import java.util.Arrays;

// import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a[] = { 3, 5, 64, 9, 99, 20, 2 };

        // swapr(a, 0, 3);
        // maxi(a);
        rev(a);
        // System.out.print(Arrays.toString(a));
    }

    // method for swap the element in an array
    static void swapr(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    // static void maxi(int[] arr) {
    // int high = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > high) {
    // high = arr[i];
    // }
    // }
    // System.out.print("High is: " + high);
    // }

    // method for reverse the element in an array
    static void rev(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapr(arr, start, end);
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
