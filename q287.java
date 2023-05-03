public class q287 {
    public static void main(String[] args) {
        int[] nums = { 3,1,3,4,2 };
        System.out.print(findDuplicate(nums));
    }

    static public int findDuplicate(int[] nums) {
        cyclicshort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) return nums[i];
        }
        return -1;
    }

    private static void cyclicshort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
