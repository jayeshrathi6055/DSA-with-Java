import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add an element at last in a list
        list.add(1);
        list.add(5);
        list.add(7);

        // Add an element at between in a list
        list.add(1,3);
        
        // Change value at any index
        list.set(2,4);

        // Remove a value at any index
        list.remove(2);

        // Get a value from a list
        System.out.println(list.get(2));

        // find the Length of a list
        System.out.println(list.size());
        System.out.println(list);

        // Sort a list
        list.set(0,8);
        Collections.sort(list);
        System.out.println(list);
    }
}