import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

class QueueClass{
    static int[] arr;
    static int size, rear = -1;
    QueueClass(int size){
        arr = new int[size];
        this.size = size;
    }
    public static void enqueue(int value){
        if(size-1==rear){
            return;
        }
        rear++;
        arr[rear] = value;
        return;
    }
    public static int dequeue(){
        if(rear==-1){
            return 0;
        }
        int low = arr[0];
        for(int i=1; i<=rear;i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return low;
    }
    public static boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    public static boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }
}

public class QueueImplementation{
    public static void main(String[] args) {
        // QueueClass q = new QueueClass(5);
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(5);
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());    

        // Using Java Collection Framework
        // Queue<Integer> q = new LinkedList<Integer>();  // or
        Queue<Integer> q = new ArrayDeque<Integer>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}