public class rec1{
    public static void print(int n)
{
    if(n==0) return; // base case 
    System.out.println(n);
    print (n-1);  // recursive case 

}
public static void main(String[] args) {
    int n=5;
    print(n);
}
}
