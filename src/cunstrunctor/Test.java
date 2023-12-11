package cunstrunctor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

                // Corrected array declaration
                int Arr[] = {7, 9, 8};

                // List declaration using Integer instead of int
                List<Integer> list = new ArrayList<>();

                // Adding elements to the list
                list.add(Arr[0]);
                list.add(Arr[2]);

                // Modifying an element at a specific index
                list.set(1, Arr[1]);

                // Removing an element from the list
                list.remove(Integer.valueOf(Arr[0])); // Convert int to Integer before removing

                // Printing the list
                System.out.println(list);




        }
}
