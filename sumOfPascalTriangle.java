/**
 * sumOfPascalTriangle
 */
public class sumOfPascalTriangle {

    public static void main(String[] args) {
        // int n = 4;
        // int sum = 0;
        // for (int i = 0; i < n - 1; i++) {
        // sum = (int) Math.pow(2, n - 1);
        // n = 1 << (n - 1);
        // }

        // System.out.println(sum);

        printPascalTriangle(4);

        // int ans = pascalTriangleSum(4);
        // System.out.println(ans);
    }

    // private static int pascalTriangleSum(int n) {
    // int sum = (int) Math.pow(2, n);
    // return sum;
    // }

    private static void printPascalTriangle(int n) {
        int first = 1;
        int second = 1;
        for (int i = 0; i <= n; i++) {

            System.out.print(first);
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
                second = first + second;
                first = second;
                System.out.print(second);
            }
            first =1;
            // for (int j = 0; j < i; j++) {
            // System.out.print(first--);

            // }
            System.out.println();
        }
    }
}