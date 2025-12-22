

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create ArrayLists
        ArrayList<String> List1 = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();

        // 1. Adding elements
        List1.add("A");
        List1.add("B");
        List1.add("C");
        System.out.println("List1 after adding elements: " + List1);

        // 2. Adding at a specific index
        List1.add(3, "D");
        System.out.println("List1 after adding 'D' at index 3: " + List1);

        // 3. Adding all elements from List1
        List2.add("X");
        List2.add("Y");
        List1.addAll(List2);
        System.out.println("List1 after adding all from List2: " + List1);

        // 4. Adding all at a specific index
        List1.addAll(2, List2);
        System.out.println("List1 after adding List2 at index 2: " + List1);

        // 5. Getting an element
        String element = List1.get(3);
        System.out.println("Element at index 3: " + element);

        // 6. Setting an element
        List1.set(1, "Z");
        System.out.println("List1 after setting index 1 to 'Z': " + List1);

        // 7. Removing by index
        List1.remove(2);
        System.out.println("List1 after removing element at index 2: " + List1);

        // 8. Removing by value
        List1.remove("Y");
        System.out.println("List1 after removing 'Y': " + List1);

        // 9. Checking size
        int size = List1.size();
        System.out.println("Size of List1: " + size);

        // 10. Checking if empty
        boolean isEmpty = List1.isEmpty();
        System.out.println("Is List1 empty? " + isEmpty);

        // 11. Checking if it contains an element
        boolean contains = List1.contains("A");
        System.out.println("Does List1 contain 'A'? " + contains);

        // 12. Index of an element
        int index = List1.indexOf("A");
        System.out.println("Index of 'A': " + index);

        // 13. Last index of an element
        List1.add("A");
        int lastIndex = List1.lastIndexOf("A");
        System.out.println("Last index of 'A': " + lastIndex);

        // 14. Sorting
        Collections.sort(List1);
        System.out.println("List1 after sorting: " + List1);

        // 15. Reversing
        Collections.reverse(List1);
        System.out.println("List1 after reversing: " + List1);

        // 16. Creating a sublist
        System.out.println("Sublist (1, 3): " + List1.subList(1, 3));

        // 17. Clearing the list
        List1.clear();
        System.out.println("List1 after clearing: " + List1);

        // 18. Copying using addAll
        List1.addAll(List2);
        System.out.println("List1 after copying List2: " + List1);
    }
}
