package arrays;

import java.util.ArrayList;
import java.util.List;

public class Class10 {
    public static void main(String[] args) {
        int a[] = {7,8,9};
        List<Integer> list= new ArrayList<>();
        list.add(a[0]);

        try{
        list.set(1,a[0]);
        }
        catch (Exception e){
            System.out.println(e+"this is exception ");
        }
        finally {
            System.out.println("this is not a regular thread");
        }

        System.out.println(list);

    }

}
