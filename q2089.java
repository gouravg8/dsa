import java.util.ArrayList;
import java.util.List;

public class q2089 {
    public static void main(String[] args) {
        // Input: nums = [1,2,5,2,3], target = 2
        // Output: [1,2]
        // Explanation: After sorting, nums is [1,2,2,3,5].
        // The indices where nums[i] == 2 are 1 and 2.
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        targetIndices(nums, target);
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
