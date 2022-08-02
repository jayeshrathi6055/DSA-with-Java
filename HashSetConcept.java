import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Add values in set
        set.add(1);
        set.add(9);
        set.add(7);
        // Print set 
        System.out.println(set);
        // Check size of the set
        System.out.println(set.size());
        // Search operation
        System.out.println(set.contains(9));
        System.out.println(set.contains(2));
        // Remove operation
        set.remove(1);
        System.out.println(set);

        // Use of iterator class - It has 2 functions that is next() and hasNext()
        Iterator it = set.iterator();
        // Manual way
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        // Alternative Way
        it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
