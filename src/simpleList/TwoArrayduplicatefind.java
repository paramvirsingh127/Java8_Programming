package simpleList;

import java.util.HashSet;
import java.util.Set;

public class TwoArrayduplicatefind {

    static void duplicatefind(int first[], int second[]){
        Set<Integer> s1 = new HashSet<>();
        for (int i=0; i< first.length;i++){
            s1.add(first[i]);
        }
        for (int i=0; i<second.length;i++){
            s1.add(second[i]);

        }
        System.out.println("union");
        System.out.println(s1);

    }
    static  void printIntersection(int first[], int second[]){
        Set<Integer> s = new HashSet<>();
        for (int i=0; i< first.length;i++){
            s.add(first[i]);
        }
        for (int i=0; i<second.length; i++){
            if (s.contains(second[i])){
                System.out.println(second[i]+" ");

            }

        }
    }
    public static void main(String[] args) {
        int[] first = {25, 45, 46, 48, 79, 7};
        int[] second = {45, 47, 98, 35, 36, 7, 49};
        //duplicatefind(first, second);
        printIntersection(first, second);

    }
}
