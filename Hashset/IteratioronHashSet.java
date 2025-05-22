package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IteratioronHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Bhajepar");

        //using Iterator
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Using for loop
        for(String city:hs){
            System.out.println(city);
        }

        System.out.println();
        System.out.println("Linked Hashset Iteration->");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Rishabh");
        lhs.add("Devansh");
        lhs.add("Ravi");
        Iterator is = lhs.iterator();
        while(is.hasNext()){
            System.out.println(is.next());
        }

        System.out.println();
        System.out.println("Tree Hashset Iteration->");
        TreeSet<String> lh = new TreeSet<>();
        lh.add("Rishabh");
        lh.add("Devansh");
        lh.add("Ravi");
        System.out.println(lh);
    }
}
