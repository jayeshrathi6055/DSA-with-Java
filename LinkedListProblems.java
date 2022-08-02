class Node{
    int data;
    Node next;
}
public class LinkedListProblems {
    public static void printLL(Node n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    public static Node deleteFromLast(Node head, int size, int n){
        if(n==size){
            return head.next;
        }
        Node temp = head;
        for(int i = 1;i<size-n;i++){
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }
    public static Node reverseLL(Node n){
        Node prev = null;
        Node curr = n;
        Node next = curr.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
    public static boolean palindromeLL(Node head){
        StringBuilder s = new StringBuilder("");
        while(head!=null){
            s.append(head.data);
            head = head.next;
        }
        if (s.toString().equals(s.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1.data = 1;
        n1.next = n2;
        n2.data = 2;
        n2.next = n3;
        n3.data = 2;
        n3.next = n4;
        n4.data = 1;
        n4.next = null;

        Node n = deleteFromLast(n1, 4, 4);
        printLL(n);
        System.out.println(palindromeLL(n1));
    }
}
