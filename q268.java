public class q268 {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };
        int ans = missingNum(arr);
        System.out.println(ans);
    }

    private static int missingNum(int[] arr) {
        cyclee(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                return i;
        }
        return arr.length;
    }

    static void cyclee(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr[i];
            if (j >= 0 && j < arr.length && arr[i] != arr[j]) {
                swap(arr, i, j);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
