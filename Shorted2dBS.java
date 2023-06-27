public class Shorted2dBS {
    public static void main(String[] args) {
        // int[][] matrix = {
        //         { 10, 20, 30, 40 },
        //         { 15, 25, 35, 45 },
        //         { 28, 29, 37, 49 },
        //         { 33, 34, 38, 50 }
        // };
        // int target = 35;
        // int[] ans = Search2d(matrix, target);
        // System.out.println(ans);
        System.out.println("hii");
    }

    static int[] Search2d(int[][] matrix, int target) {

        int row = 0;
        int column = matrix.length - 1;
        while(row <= matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[] {row, column};
            }
            if(matrix[row][column] < target){
                
            }
        }
        return new int[] { -1, -1 };
    }
}
