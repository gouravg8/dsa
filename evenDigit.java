public class evenDigit {
    public static void main(String[] args) {
        int n = 230;
        int noOfDigit = noOfDigit(n);
        boolean ans = isEvenDigit(noOfDigit);
        System.out.print(ans);
    }

    static int noOfDigit(int n) {

        // return (int) (Math.log10(n) + 1);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static boolean isEvenDigit(int n) {

        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
