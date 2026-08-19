import java.util.*;

public class reverse{
    public static String reverse(String s){
        // array bana ke reverse karo 
        char arr[]= s.toCharArray();
        // array reversahal 
          int left=0;
        int right=arr.length-1;
        while( left<right){
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        return new String( arr);

    }
    public static void main( String[] args){
        Scanner sc= new Scanner( System.in);
      

        String s= sc.nextLine();
        String result=reverse(s);
        System.out.print( result);
        sc.close();

    }
}