package simpleList;

import java.util.StringJoiner;

public class Joiner {
    public static void main(String[] args) {
        //todo we are using Stringjoiner and create a object joiner than we have used add method to join String like
        // A, B, C with passing delimiter , sign and we can use prefix and suffix
        // same two object create
        // after that we are using merge method to join both string object value;
        StringJoiner str1= new StringJoiner(",", "[","]");
        str1.add("A").add("B").add("C");
        System.out.println(str1);
        StringJoiner str2= new StringJoiner(":");
        str2.add("P").add("Q");
        System.out.println(str2);
        str1.merge(str2);
        System.out.println(str1);
    }
}
