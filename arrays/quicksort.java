 import java.util.*;

 public class quicksort {
    public static  void quickSort(int[] arr, int low, int high) {
        // code here
       // aacha question hai medium level ka 
       if( low< high){
           int p= partition( arr,low, high );
           
           // function call hoga 
           quickSort( arr , low,p-1);
           quickSort( arr,p+1,high);
       }
       
       
    }

    public  static int partition(int[] arr, int low, int high) {
        // code here
        // aab main pivote functiob banao 
        int pivote = arr[high];
        int i=low-1;
        for( int j= low ; j<high;j++){
            if( arr[j]<pivote ){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                
            }
        }
        int temp= arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
         
         return i+1;
       
                
                
                
        // idgar bhi swap maro 
        
        
    }

    // aab main function banao 
    public static void main( String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // function call 
        quickSort(arr,0,n-1);

        for( int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

    }
}