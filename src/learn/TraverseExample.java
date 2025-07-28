package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

    public static void main(String [] args){


        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandana");
        names.add("Vandana");

        // Traversing the List with the help of for each loop

        for(String str : names){
            System.out.print(str + "\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("---------------------------------------");

        // Traversing with help of iterator for forward traversal
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }

        // Traversing the iterator in backword direction
        ListIterator<String> litr = names.listIterator(names.size()); // Size should be given so that cursor can start from the end.

        while(litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);
        }

        System.out.println("--------------------------------------------------");

        // For Each Method using lambda expression
        System.out.println("Using ForEach Method");
        names.forEach(e->{
            System.out.println(e);
        });

        System.out.println("-------------------------------------------------------");

        System.out.println("Using TreeSet for sorting data");
        TreeSet<String> tset = new TreeSet<>();
        tset.addAll(names);
        tset.forEach(str->{
            System.out.println(str);
        });
    }
}
