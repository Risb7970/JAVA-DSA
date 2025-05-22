package Hashset;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,9,0,1,2,12,3};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
