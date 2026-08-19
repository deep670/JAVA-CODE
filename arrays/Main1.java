import java.util.*;

 public class Main1{
    public static int firstoccurance( int [] arr,int key){
        int low=0;
        int n=arr.length;
        int high= n-1;
        int ans=-1;
        
        // aab aah pe code likhi first occurance ka 
        while( low<=high){
            int mid= low+(high-low)/2;
            if( arr[mid]== key){
                ans=mid;
                high=mid-1;
            }
            else if( arr[mid]>key){
                high=mid-1;

            }
            else{
                low=mid+1;

            }

        }
        return ans;

    }
    // now code likho for last occurance ka 
    public static int lastoccurance( int [] arr,int key){
        int low=0;
        int n=arr.length;
        int high= n-1;
        int ans=-1;
       
        // aab aah pe code likhi first occurance ka 
        while( low<=high){
            int mid= low+(high-low)/2; 
             
            if( arr[mid]== key){
                ans=mid;
                low=mid+1;
            }
            else if( arr[mid]>key){
                high=mid-1;

            }
            else{
                low=mid+1;

            }
            
        }
        return ans;

    }
    // dono function likh chuke hai aab 
    // main function ka code karo input lo 
    public static void main( String[] args){
        Scanner sc= new Scanner( System.in);
        
        int n=sc.nextInt();
        int [] arr= new int [n];
        // aab element input lo 
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // now functio call hoga 
        int key=sc.nextInt();
        int first= firstoccurance( arr,key);
        int last= lastoccurance( arr,key);
        System.out.println(first);
        System.out.println(last);
        sc.close();

    }


     
 }

