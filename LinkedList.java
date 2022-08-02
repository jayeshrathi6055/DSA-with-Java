class Node{
    int data;
    Node next;
}

public class LinkedList{
    public static void printLL(Node n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    public static Node insertAtIndex(Node n,int index, int value){
        Node temp =  n;
        Node m =  new Node();
        m.data = value;
        while(index-1>0){
            if(n==null){
                return temp;
            }
            n = n.next;
            index--;
        }
        if(n==null){
            return temp;
        }
        Node t = n.next;
        n.next = m;
        m.next = t;
        n = temp;
        return n;
    }
    public static Node insertAtFirst(Node n, int value){
        Node m = new Node();
        m.data = value;
        m.next = n;
        return m;
    }
    public static Node deleteByIndex(Node n, int index){
        if(index==0){
            return n.next;
        }
        Node m = n;
        n = n.next;
        Node temp = m;
        while(index-1>0 && n!=null){
            n = n.next;
            m = m.next;
            index--;
        }
        m.next = n.next;
        m = temp;
        return m;
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
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1.data = 1;
        n1.next = n2;
        n2.data = 2;
        n2.next = n3;
        n3.data = 3;
        n3.next = n4;
        n4.data = 4;
        n4.next = null;
        // Node n = insertAtIndex(n1, 3, 5);
        // Node n = insertAtFirst(n1, 5);
        // printLL(n1);
        // Node n = deleteByIndex(n1, 0);
        // printLL(n);
        Node n = reverseLL(n1);
        printLL(n);

    }
}