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
        // names.set(1,"Maverick");
        // System.out.println(names);

        // add method add the element at the position and shift the next elements at +1 position.
        names.add(1,"Maverick");
        System.out.println(names);

        // remove all elements
        // names.clear();

        // Copy all the elements of the arraylist into the vector.

        System.out.println("Vector ==> ");
        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("Vector "+vector);


        System.out.println("__________________________________________________________________________________");

        System.out.println("HASHSET ==> ");
        HashSet<Double> nms = new HashSet<>();
        nms.add(10.10);
        nms.add(12.12);
        nms.add(13.13);
        nms.add(15.15);
        nms.add(14.14);

        System.out.println(nms);

        System.out.println("TreeSet ==> ");
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

    }
}
