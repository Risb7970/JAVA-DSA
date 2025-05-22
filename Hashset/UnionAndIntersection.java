package Hashset;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {6,9,3};
        int arr2[] = {2,5,7,9,1,8};
        HashSet<Integer> hs = new HashSet<>();

        //Union
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union = " + hs.size());

        //Intersection
        hs.clear();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        int count =0;
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("Interesection = " + count);
    }
}
