public class min {
    public static void main(String[] args) {
        int[] arr = { 3, 634, 52, 74, 31, 97 };
        int ans = miniWala(arr);
        System.out.print(ans);
    }

    static int miniWala(int[] arr) {
        int min = arr[0];
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
