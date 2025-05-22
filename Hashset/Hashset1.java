package Hashset;
import java.util.HashMap;
public class Hashset1 {
    public static void main(String[] args) {
       HashMap<String,Integer> hm = new HashMap<>();

       hm.put("India" , 100);
       hm.put("Pakistan" , 1120);
       hm.put("Bhajepar" , 1200);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Saran"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Star"));

        hm.remove("Bhajepar");
        System.out.println(hm);

        System.out.println(hm.size());

        hm.clear();

        System.out.println(hm.isEmpty());
    }
}
