// code for selection sort

// printarray method here 
class Sorting2{  // ye class capital me likho 
   public static void PrintArray( int arr[]){
    for (int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   } 
// making main method
   public static void main (String args[]){
    int arr[]={5,4,1,3,2};
    // bubble sort 
    int n=arr.length;
    // outer loop 
    for( int i=0;i<n-1;i++){
        int smallest=i;
        // inner loop 
        for( int j=i+1;j<n; j++){
            if (arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        // now perform swap 
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;

    }











    PrintArray(arr);
   }
}