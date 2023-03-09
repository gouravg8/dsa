import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = primee(num);
        System.out.println(ans);
        sc.close();
    }

    static boolean primee(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if ((num % c) == 0) {
                return false;
            }
            c++;
        }

        // if (c * c > num) {
        // return true;
        // }
        // return true;
        // System.out.println(c * c > num);
        // System.out.println(c * c > num);
        // System.out.println(c * c > num);
        return c * c > num;
    }
}
