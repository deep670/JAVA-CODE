public class  rec2 {
     public static int facrorial( int n ){
          // making base case 
          if ( n==1 || n==0){
                return 1;
          }
           int fact1= factorial(n-1); // making recursive case 
           int fact2= n* fact1;
           return fact2;



     }
      public static void main(String[] args) {    // main function 
          int n=5;
          factorial(n);
      }
}