/**
 * Operators
 */
public class Operators {

    public static void main(String[] args) {
        // int n = 108;
        // System.out.println(isOdd(n));

        // int[] arr = { 1, 2, 3, 6, 3, 1, 2 };
        // System.out.println(findNonduplicate(arr));

        // int n = 5; // 0101
        int n = 7; // 0111
        int i = 3;
        // System.out.println(findIthBitOfNumber(n, i));

        // int num = 12, n = 0;
        // System.out.println(setTheNthBit(num, n));

        // System.out.println(setBit(n, i));
        System.out.println(clearBit(n, i));
    }

    private static int clearBit(int n, int i) {
        int bitMask = (1 << i - 1);
        int operation = ~(bitMask); // and with not
        int ans = (n & operation);
        return ans;
    }

    // private static int setBit(int n, int i) {
    // // after manipulation 5(0101) to 2nd position(n-1) = 1st index
    // int bitMask = (1 << i - 1);
    // int operation = (n | bitMask);
    // // 5(0101) becomes = 7(0111)
    // // 5(0101) , 3rd pos(2nd index) = 11(1101)
    // return operation;
    // }

    // private static boolean isOdd(int n) {
    // return (n & 1) == 1;
    // }

    // private static int findNonduplicate(int[] arr) {
    // int ans = 0;
    // for (int i : arr) {
    // ans ^= i;
    // }
    // return ans;
    // }

    // static int findIthBitOfNumber(int n, int i) {
    // // int ans = n & (1 << (n - 1));
    // // int bitMask = 1 << n - 1;
    // // int ans = n & bitMask;
    // // ans = ans >> k - 1;
    // int ans = (n & (1 << i) >> i);
    // // int ans = ((n & (1 << (i))) >> (i));
    // return ans;
    // }

    // static int setTheNthBit(int num, int n) {
    // int ans = (1 << n) | num;
    // return ans;
    // }

}