import java.util.ArrayList;
import java.util.List;

public class q442 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // cycleShort(findDuplicates(nums));
        System.out.print(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        cycleShort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        // cycleShort(ans);
        // System.out.print(cycleShort(nums));
        return ans;
    }

    private static int cycleShort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (correct < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
