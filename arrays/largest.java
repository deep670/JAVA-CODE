import java.util.*;
class largest{
     public static int larges(int[] arr) {
        // code here
     int n= arr.length;
     int largest=arr[0];
     for( int i=1;i<n;i++){
         if( arr[i]> largest){
             largest=arr[i];
         }
     }
     return largest;
     
    }
    // main method 
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int [n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // function ko call karenge 
        int ans= larges( arr);
        System.out.print( ans+" ");


    }


}