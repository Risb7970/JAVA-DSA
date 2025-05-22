package GreedyApproach;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class MinCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins , Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int amount = 590;
        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    amount -=coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("The total minimum number of coins " + count);
        System.out.println(ans);
    }
}
