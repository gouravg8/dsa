public class Search2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 6, 2, 6 },
                { 2, 64, 23, 75 },
                { 23, 7 }
        };
        int target = 634;
        int ans = serachIn2d(arr, target);
        System.out.print(ans);
    }

    static int serachIn2d(int[][] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return arr[i][j];
                }
            }
        }

        return -1;
    }
}
