public class CountEvenInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 63, 23, 754, 99, 234, 642, 643535, 43 };
        int ans = noOfEvens(arr);
        System.out.print(ans);
    }

    static int noOfEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = (int) (Math.log10(arr[i]) + 1);
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
