package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Pravin");
        names.add("Kadam");
        names.add("Omkar");
        names.add("Kadam");

        // Display the ArrayList
        System.out.println("Original ArrayList: " + names);

        // Accessing elements
        String firstElement = names.get(0); // "Pravin"
        String lastElement = names.get(names.size() - 1); // "Kadam"
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Modify an element
        names.set(1, "Prasad");
        System.out.println("ArrayList after setting element at index 1: " + names);

        // Remove an element
        names.remove(2); // Removes "Omkar"
        System.out.println("ArrayList after removing element at index 2: " + names);

        // Check if an element exists
        boolean containsPravin = names.contains("Pravin");
        System.out.println("Does names contain 'Pravin'? " + containsPravin);

        // Check if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Iterate over the ArrayList using enhanced for loop
        System.out.print("Iterating over ArrayList using enhanced for loop: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Sorting the ArrayList
        Collections.sort(names);
        System.out.println("ArrayList after sorting: " + names);

        // Clear the ArrayList
        names.clear();
        System.out.println("ArrayList after clearing: " + names);
    }
}
