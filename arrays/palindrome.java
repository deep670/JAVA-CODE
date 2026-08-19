 import java.util.*;
 public class palindrome  {
     public static boolean isPalindrome(int n) {
        // code here
        // original == reverse karo do ho jayrga plaindrome 
        int original = n;
        int reverse =0;
        while( n>0){
            int digit=n%10;
            reverse = reverse*10+ digit;
            n=n/10;
            
        }
        if( original == reverse){
        return true;
        }
        else {
            return false;
        }
    }

    // making main class
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        System.out.print(isPalindrome(n));
        sc.close();

    }
}