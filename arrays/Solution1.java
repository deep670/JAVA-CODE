import java.util.*;

class Solution1 {

    public boolean hasTripletSum(int arr[], int target) {

        Arrays.sort(arr);

        int n = arr.length;

        // Ek element fix karo
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size
        int n = sc.nextInt();

        // Array input
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Target
        int target = sc.nextInt();

        Solution1 obj = new Solution1();

        boolean ans = obj.hasTripletSum(arr, target);

        System.out.println(ans);

        sc.close();
    }
}
