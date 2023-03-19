import javax.swing.text.html.HTMLDocument.RunElement;

public class q268 {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums.length) {
                return 0;
            } else {
                shortt(nums);
                if (nums[i] != i) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static void shortt(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int correct = nums[i];
            if (nums[i] == i) {
                continue;
            } else {
                int temp = nums[i];
                nums[i] = correct;
                correct = temp;
            }
        }
    }
}
