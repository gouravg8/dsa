import java.util.Arrays;

public class q167 {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = getAns(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getAns(int[] numbers, int target) {
        int[] ans = { 0, 0 };
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] { -1, -1 };
    }
}
