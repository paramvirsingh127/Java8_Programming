package arrays;

public class Class7 {
    static void totalstring(){
        String string= "this is paramvir";
        //String string2;



        char[] str= string.toCharArray();
        //char[] str2= string2.toCharArray();
        String charect=" ";

        for (int i=0;i<str.length;i++){

            if (string.charAt(i)=='a'|| string.charAt(i)=='e'
            ||string.charAt(i)=='i'||string.charAt(i)=='o'
                    ||string.charAt(i)=='u'){
                System.out.println(string.charAt(i));

            }else {
                System.out.println(string.charAt(i));
            }
                
        }
        //System.out.println(charect);

    }
    public static void main(String[] args) {
        totalstring();
    }
}
/*Java String Programs
1) Java Program to count the total number of characters in a string
2) Java Program to count the total number of characters in a string 2
3) Java Program to count the total number of punctuation characters exists in a String
4) Java Program to count the total number of vowels and consonants in a string
5) Java Program to determine whether two strings are the anagram
6) Java Program to divide a string in 'N' equal parts.
7) Java Program to find all subsets of a string
8) Java Program to find the longest repeating sequence in a string
9) Java Program to find all the permutations of a string
10) Java Program to remove all the white spaces from a string
11) Java Program to replace lower-case characters with upper-case and vice-versa
12) Java Program to replace the spaces of a string with a specific character
13) Java Program to determine whether a given string is palindrome
14) Java Program to determine whether one string is a rotation of another
15) Java Program to find maximum and minimum occurring character in a string
16) Java Program to find Reverse of the string
17) Java program to find the duplicate characters in a string
18) Java program to find the duplicate words in a string
19) Java Program to find the frequency of characters
20) Java Program to find the largest and smallest word in a string
21) Java Program to find the most repeated word in a text file
22) Java Program to find the number of the words in the given text file
23) Java Program to separate the Individual Characters from a String
24) Java Program to swap two string variables without using third or temp variable.
25) Java Program to print smallest and biggest possible palindrome word in a given string
26) Reverse String in Java Word by Word
27) Reserve String without reverse() function*/
