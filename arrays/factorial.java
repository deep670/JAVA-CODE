import java.util.*;
public class factorial {
    // factorial function 
     static int facto( int n){
        int fact=1;
        for( int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    // main funxtion 
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        // 
         //int ans=facto(n);
        System.out.println(facto(n));
        sc.close();
    }
    
}
