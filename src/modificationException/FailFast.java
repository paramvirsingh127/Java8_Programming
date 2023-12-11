package modificationException;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(6);
        list.add(4);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer integer= it.next();
            list.add(3); // it will create exception
        }
    }
}
