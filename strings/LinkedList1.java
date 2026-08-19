class Node{
    int data;
    Node next;
    Node( int data){
         this.data=data;
         this.next=null;
    }
}
// making main function 
public class LinkedList1 {
public static void main( String[] args){
    Node head= new Node(10);
    Node second = new Node(20);
    Node third=new Node(30);
    // Node fourth  =new Node(40);

    //linking the nodes
    head.next=second;
    second.next =third;
    Node temp=head;
    // writing condition for traversing the linked list
    
    while( temp!=null){
        System.out.print(temp.data+" ");
        // System.out.print("->");
        temp=temp.next;
    }



}
}