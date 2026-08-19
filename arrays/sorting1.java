class sorting1{
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
    for (int i=0; i<n-1; i++){
        for (int j=0; j<n-1-i; j++){
            if (arr[j]>arr[j+1]){
                // swap 
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    PrintArray(arr);
   }
}