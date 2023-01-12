public class recuFactorial {
    public static void main(String[] args) {
        int n = fact(4);
        System.out.print(n);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int recResult = fact(n - 1);

        int result = recResult * n;
        return result;
    }
}
