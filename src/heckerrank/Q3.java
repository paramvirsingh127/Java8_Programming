package heckerrank;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        String A= "this is a string";
        String str= " ";
        for (int i= A.length()-1;i>=0;i--) {
            str = str+ A.charAt(i);

        }
        System.out.println(str);
        if(A.equals(str)){
            System.out.println("yes, this string is not same so we can say that it is palindome number ");
        }else {
            System.out.println("No, this string is same so we can say that it is not palindrome number");
        }


    }
}
