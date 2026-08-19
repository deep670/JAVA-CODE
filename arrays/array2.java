import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] marks = new int[size];

        // Input
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }

        // Output
        for(int i = 0; i < size; i++){
           //  System.err.println("marks ");
            System.out.println(marks[i]);
        }

    sc.close();
    }
}
