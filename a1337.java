import java.util.Arrays;

public class a1337 {
    public static void main(String[] args) { 
        int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
        // int[] ans = kWeakestRows(mat, 3);
        // for (int i : ans) {
        // System.out.println(i);
        // }
        // for (int i = 0; i < ans.length; i++) {
        int[] soldiers = {};
        for (int i = 0; i < mat.length; i++) {
            int nums = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    nums++;
                }
            }
            soldiers[i] = nums;
        }
        System.out.println(soldiers);
        // }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        // List<Integer> soldiers = new ArrayList<>();
        int[] soldiers = {};
        for (int i = 0; i < mat.length; i++) {
            int nums = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    nums++;
                }
            }
            soldiers[i] = nums;
        }
        // Input: mat =
        // [[1,1,0,0,0],
        // [1,1,1,1,0],
        // [1,0,0,0,0],
        // [1,1,0,0,0],
        // [1,1,1,1,1]],
        // k = 3
        // Output: [2,0,3]
        // Explanation:
        // The number of soldiers in each row is:
        // - Row 0: 2
        // - Row 1: 4
        // - Row 2: 1
        // - Row 3: 2
        // - Row 4: 5
        // The rows ordered from weakest to strongest are [2,0,3,1,4].
        return soldiers;
    }
}
