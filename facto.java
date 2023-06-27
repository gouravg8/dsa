import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
        sc.close();
    }

    static int fact(int n) {
        int num = 1;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                num = num * i;
            }
        }
        return num;
    }
}
