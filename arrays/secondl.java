import java.util.*;
class secondl{
    // logic code here 
     public int getSecondLargest(int[] arr) {
       // aacha question hai sec
       int max1= Integer.MIN_VALUE;
       int max2= Integer.MIN_VALUE;
       int n=arr.length;
       // edge case pass
       if( n<2){
           return -1;
       }
       // check first largest ;
       
       for( int i=0;i<n;i++){
           if( arr[i]>max1){
               max2=max1;
               max1=arr[i];
           }
           else if( arr[i]>max2 && arr[i]!=max1){
               max2=arr[i];
           }
           
       }

    if( max2==Integer.MIN_VALUE)
    {
        return -1;
    }
       return max2;
    
        
    }
    // main finction 
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int [n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // function ko call karenge 
        secondl obj= new secondl();

        int ans=  obj.getSecondLargest(arr);
        System.out.print( ans+" ");


    }


}


