package bookingSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashmapClass {
    static void mapmethod(){
        HashMap<Integer, User>map= new HashMap<>();
        map.put(1, new User("paramvir",new Address("bhakti garhi","tundla","firozabad",
                "uttar pradesh", 283204),"9536664758"));
        map.put(2, new User("gourav",new Address("bhakti garhi","tundla","firozabad",
                "uttar pradesh", 283204),"9536664758"));
        map.put(3, new User("ravi",new Address("bhakti garhi","tundla","firozabad",
                "uttar pradesh", 283204),"9536664758"));
        map.put(4, new User("rajkumar",new Address("bhakti garhi","tundla","firozabad",
                "uttar pradesh", 283204),"9536664758"));

        Set<Integer> keys= map.keySet();
        for (Integer var : keys) {
            System.out.println(map.get(var));

        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        HashmapClass obj= new HashmapClass();
        obj.mapmethod();
    }
}
