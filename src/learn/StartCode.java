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
        names.add("Delta");

        System.out.println(names);

        /*
        LinkedList list = new LinkedList();
        list.add(10);
        list.add("James");
        list.add(true);
        list.add(3.123);
        System.out.println(list);
         */


        names.remove("Delta"); // use to remove the object or element.

        System.out.println(names);

        //Size
        System.out.println(names.size());

        // Check item is there or not
        // Types ka equals method call krta hai checking karne k liye.
        System.out.println(names.contains("Bob"));

        // Check for empty
        System.out.println(names.isEmpty());

        // Setting values..
        // Set will remove the element at the given position and replace it with new field.
         names.set(1,"Maverick");

        //names.add(1,"Maverick");

    }
}
