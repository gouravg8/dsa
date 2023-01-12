/**
 * recu
 */
public class recuSwap {

    public static void main(String[] args) {
        
        // int n = fact(4);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length - 1;

        System.out.print("Given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // int call = swap(arr, size);
        // System.out.print(swap(arr, size));
        System.out.println();
        swap(arr,0, n);
        System.out.print("Swapped array is: ");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
    }

    
    public static int swap(int arr[], int st, int n) {
        if(st >= n){
            return 1;
        }

        int temp = arr[st];
        arr[st] = arr[n];
        arr[n] = temp;

        int s = swap(arr, st + 1, n  - 1);
        return s;
    }
}