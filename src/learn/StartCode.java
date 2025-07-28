package learn;

import java.util.*;

public class StartCode {

    public static void main(String[] args) {
        System.out.println("Welcome to code java FrameWorks..");

        /*
        1) Type Safe - same type of elements (objects can be added to the collections.

            ArrayList<String> name = new ArrayList<>();

        2) Untype safe - different type of element can be added to the collection.

            ArrayList name = new ArrayList();
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Bob");
        names.add("Coyote");

        System.out.println(names);

//        LinkedList list = new LinkedList();
//        list.add(10);
//        list.add("James");
//        list.add(true);
//        list.add(3.123);
//        System.out.println(list);
    }
}
