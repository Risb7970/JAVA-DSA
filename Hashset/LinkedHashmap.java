package Hashset;
import java.util.LinkedHashMap;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India" , 100);
        lhm.put("China" , 0);
        lhm.put("Pakistan" , -1);

        System.out.println(lhm);
    }
}
