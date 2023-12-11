package arrays;

import java.util.Arrays;

public class Class3 {
    public static void main(String[] args) {
        int a[]= {34,67,3,575,68};
        int result=0;
        //int sum= Arrays.stream(a).sum();
        //System.out.println(sum);
        // sum of all elements
        /*for (int i=0;i<a.length;i++){
            result += a[i];
            System.out.println(result);// if we print in loop, it will print sum many time
                                       //so we should print out of loop
        }
        System.out.println(result);*/
        int odd=0;

        for (int i=0;i< a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);

            }
            else {
                System.out.println(a[i]);
                odd += a[i];
            }
        }


    }
}
