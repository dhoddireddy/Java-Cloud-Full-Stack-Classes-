package collections;

import java.util.*;

public class CollectionTrail {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        
        list1.add("Babu");
        list.add("Java");
        list.add("Python");
        list.add("Java"); // duplicate allowed

        System.out.println(list);

        System.out.println(list.get(1)); // get element

        list.remove("Python"); // remove element
        list.add(1, "Raju" );
        list.addAll(list1);
        list.indexOf("Babu");

        System.out.println(list);
    }
}