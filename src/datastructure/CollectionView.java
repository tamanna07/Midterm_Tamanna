package datastructure;

import java.util.*;
public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for (HashMap.Entry<Integer, String> collection : map.entrySet()) {
                System.out.println(collection.getKey()+ " " + collection.getValue());

        }


}

}
