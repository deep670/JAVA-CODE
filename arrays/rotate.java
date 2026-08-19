import java.util.Scanner;

public class rotate {

    // rotate array left by d places
    public static void rotatearray(int arr[], int d) {

        int n = arr.length;

        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // d ki value input lo
        int d = sc.nextInt();

        // function call
        rotatearray(arr, d);

        // array print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}