/**
 * magicNumber
 */
public class magicNumber {

    public static void main(String[] args) {
        // int n = 4; // 0100
        // System.out.println(findMagicNumber(4));// 0100
        // System.out.println(magic());
        System.out.println(newMagic(4));
    }

    // -----------magic number finder by me
    // private static int findMagicNumber(int n) {
    //     int bit = n & 1;
    //     int ans, out = 0, i = 1;
    //     while (n > 0) {
    //         if (bit == 1) {
    //             ans = (int) Math.pow(5, i);
    //             out += ans;
    //         }
    //         n = n >> 1;
    //         bit = n & 1;
    //         i++;
    //     }
    //     return out;
    // }

    // -----magic number finder by kunal
    // private static int magic() {
    //     int n = 4;
    //     int ans = 0;
    //     int base = 5;
    //     while (n > 0) {
    //         int last = n & 1;
    //         n = n >> 1;
    //         ans += last * base;
    //         base = base * 5;
    //     }
    //     return ans;
    // }

    // my optimization
    private static int newMagic(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }
}