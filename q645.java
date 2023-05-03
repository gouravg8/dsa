import java.util.Arrays;

public class q645 {
    public static void main(String[] args) {
        int[] nums = { 1, 1 };
        int[] ans = findErrorNums(nums);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[correct] != correct) {
                return new int[] { -1, -1 };
            }else{
                i++;
            }
        }
        return nums;
    }

}
