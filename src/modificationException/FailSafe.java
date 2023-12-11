package modificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map= new ConcurrentHashMap<>();
        map.put("Physics", 54);
        map.put("Chemistry",42);// getting iterator from map

        Iterator<String> it= map.keySet().iterator();
        while (it.hasNext()){
            String key= it.next();
            System.out.println(key+ map.get(key));
            map.put("Biology",3);

        }

    }
}
