public class addTarget {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int indices = indi(nums, target);
        System.out.print(indices);
        // System.out.print(Arrays.toString(indices));
    }

    static int indi(int[] nums, int target) {
        // int[] out = {};
        int first = 0;
        // int second = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // if (target - nums[i] == nums[j]) {
                //     out[0] = i;
                //     out[1] = j;
                // }
                first = nums[i];
            }
        }
        return first;
    }
}
