package bookingSystem;

import java.awt.*;

public class ReverString {

    public static void main(String[] args) {
        //todo string reverse by using for loop
        String string = "this is my  name ";
        String reverse= " ";
        for(int i=string.length()-1;i>=0;i--){
            reverse = reverse+ string.charAt(i);
        }
        System.out.println(reverse);

        // by using string buffer
        StringBuffer br= new StringBuffer(string);
        br.reverse();
        System.out.println(br);

        // by using string builder
        StringBuilder builder= new StringBuilder(string);
        builder.reverse();
        System.out.println(builder);

    }


}
