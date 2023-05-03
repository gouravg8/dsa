import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q448 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // int[] ans = cyclicshort(nums);
        // System.out.print(Arrays.toString(ans));
        // findDisappearedNumbers(nums);
        System.out.print(findDisappearedNumbers(nums));
        // System.out.print(nums.length);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicshort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static int[] cyclicshort(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
