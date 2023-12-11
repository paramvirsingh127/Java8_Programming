package heckerrank;

import java.util.StringJoiner;

public class Q1 {
    // how to get "Hello, World."
    //todo we can use java 8 programing
    public static void main(String[] args) {
        StringJoiner s = new StringJoiner(",","[","]");
        //string first is Hello and
        // second String is world
        s.add("Hello").add("World");
        System.out.println(s);
        StringJoiner s2 =new StringJoiner(","," ",".");
        s2.add("Aman").add("kumar");
        System.out.println(s2);

        s.merge(s2);
        System.out.println(s);

    }

}
