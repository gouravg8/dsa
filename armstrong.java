import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.print("Enter numer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = isArm(n);
        System.out.println(ans);
        sc.close();
    }

    static int isArm(int n) {

        return 1;
    }
}
