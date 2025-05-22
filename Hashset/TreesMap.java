package Hashset;
import java.util.TreeMap;// O(logn) it is implemented by using red black trees
public class TreesMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> thm = new TreeMap();

        thm.put("Hello",5);
        thm.put("Hii",3);
        thm.put("Bye",3);
        System.out.println(thm);
    }
}
