public class Question {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 23, 643, 32, 98, 93, 29, 924 };
        int target = 643;
        int start = 1;
        int end = 5;
        // String name = "Gourav soni";
        // char target = 'o';
        // boolean ans = isIn(arr, target);
        int ans = isInRange(arr, target, start, end);
        // boolean ans = isInStr(name, target);
        // String anu = (ans) ? "Han hai" : "Nahi hai";
        System.out.print(ans);
    }

    static boolean isInStr(String arr, char target) {
    for (int i = 0; i < arr.length(); i++) {
    if (arr.charAt(i) == target) {
    return true;
    }
    }
    return false;
    }

    static boolean isIn(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
    return true;
    }
    }
    return false;
    }

    static int isInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
