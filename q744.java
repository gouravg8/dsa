/**
 * q744
 */
public class q744 {

    public static void main(String[] args) {
        char[] letters2 = { 'e', 'e', 'e', 'e', 'e', 'x', 'x', 'x' };
        // int[] letters = { 4, 56, 234, 4432 };
        char target2 = 'e';
        // int target = 55;
        char ans = getAns2(letters2, target2);
        // int ans = getAns(letters, target);
        System.out.println(ans);

    }

    private static char getAns2(char[] letters, char target) {
        if (target > letters[letters.length - 1] || target == letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid] || target == letters[mid + 1]) {
                start = mid + 1;
            } else {
                return letters[mid + 1];
            }
        }
        return letters[start];
    }

    private static int getAns(int[] letters, int target) {
        if (target > letters[letters.length - 1])
            return -1;
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else {
                return mid + 1;
            }
        }
        return start;
    }

    static boolean found(char[] letters, char target) {
        int start = 0, end = letters.length - 1, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid - 2]) {
                end = mid - 1;
            } else if (target > letters[mid - 2]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}