package Hashset;

import java.util.HashMap;
import java.util.Set;

public class IterationHashset {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Rishabh",100);
        hm.put("Devansh",99);
        hm.put("Pari" , 299);
        hm.put("Shloka",300);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println("Key = "+k+" "+ "Value = "+hm.get(k));
        }

    }
}
