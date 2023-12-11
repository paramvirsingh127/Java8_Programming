package modificationException;

import java.util.ArrayList;
import java.util.List;

public class ModificationException {
    public static void main(String[] args) {
        ArrayList<String> list = null;
        for(int i=0; i< list.size();i++){
            list.add("paramvir"); // it will create exception
        }
    }

}
