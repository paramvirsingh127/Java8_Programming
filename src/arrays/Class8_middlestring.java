package arrays;


import java.util.HashSet;
import java.util.Set;

public class Class8_middlestring {
    public static void printMiddleCharacter(String str) {
        int len = str.length();

        int middle = len / 2;
         //str.charAt(middle);
        if (middle%2==0) {
            System.out.println(str.charAt(middle));
        }
        else {
            System.out.println();
        }
    }

        static String findMiddleLetter() {
        String str="testl";
            int length = str.length();
            int middleIndex = length / 2;
            String ans="";

            if (length % 2 == 0) {
                // If the length is even, return the middle two letters
                ans+=str.substring(middleIndex -1, middleIndex +1);

            } else {
                // If the length is odd, return the middle letter
                ans+= str.substring(middleIndex, middleIndex+1);

            }
            return ans;
    }
    static void mid(){
        String str="testl";
        int n= str.length();
        String s="";
        int middle= n/2;
        if (n%2==0) {
            for (int i=middle-1; i<middle+1;i++){
                //System.out.println(str.charAt(i));
                s+= str.charAt(i);
            }
            System.out.println(s);
        }
        else {
            System.out.println(str.charAt(middle));
        }
    }
    static void  stringset2(){
        String str= "aadddeee";//ababa= 6,2
        String substr= "ade";
        int n= str.length();

        Set<Integer> s= new HashSet<>();
        for (int i=0; i< str.length();i++){
            s.add((int) str.charAt(i));
        }
        for (int i=0;i< substr.length();i++) {
            if (s.contains(substr.charAt(i))) {

                System.out.println(s);
            }
        }
    }
    public static void main(String args[]) {
        //mid();
        //findMiddleLetter();
        stringset2();

    }
}
