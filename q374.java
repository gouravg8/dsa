import java.util.Random;
import java.util.Scanner;

public class q374 {
    public static void main(String[] args) {
        // find square root of given number
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int compNum = r.nextInt(100);
        int ans = 0, num = 0;
        while (num != -2) {
            num = sc.nextInt();
            ans = guess(compNum, num);
            if (num == -2)
                break;
            System.out.println(ans);
        }
        sc.close();
    }

    private static int guess(int compNum, int num) {
        if (compNum > num) {
            System.out.println("Think big");
            return -1;
        } else if (compNum < num) {
            System.out.println("Little small");
            return 1;
        } else {
            System.out.println("You won");
            return 0;
        }
    }
}
