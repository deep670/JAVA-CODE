import java.util.*;

public class fibbonaci {

    // fibonacci function
    static void fibo(int n) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    // main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibo(n);

        sc.close();
    }
}