/**
 * PowerOfTwo
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        // int n = 14;
        // boolean ans = (n & (n - 1)) == 0;
        // System.out.println(ans);
        // NoOfDigits();
        // FindSetBits();
        // fibbo(10);
    }

    private static void NoOfDigits() {
        int n = 10; // 1010
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        // (Math.log(n) / Math.log(b)) + 1
        System.out.println(ans);
    }

    private static void FindSetBits() {
        int n = 45; // 1010
        int count = 0;
        System.out.println(Integer.toBinaryString(n));
        // System.out.println(n & -n);

        // private static int setBits (int n) {
        // int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        System.out.println(count);
        // while (n > 0) {

        // }
    }
}