package heckerrank;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class Hericlass {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(56);
        list.add(58);
        list.add(59);
        list.add(564);
        list.add(562);
        list.add(569);
        list.add(56);
        Set<Integer> s= new HashSet<>();
        for (Integer var: list){

            s.add(var);
            for (Integer x: list){
                if (s.contains(x)) {
                    System.out.println(s);
                }
            }

        }







    }
}
