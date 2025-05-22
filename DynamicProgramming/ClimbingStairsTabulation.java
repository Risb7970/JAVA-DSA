package DynamicProgramming;

public class ClimbingStairsTabulation {
    public static int countWays(int n){
        int ans[] = new int[n+1];
        ans[0] =1;
        for(int i=1; i<=n; i++){
            if(i==1){
                ans[i] = ans[i-1];
            }else {
                ans[i] = ans[i - 1] + ans[i - 2];
            }
        }
        return ans[n];
    }
    public static void main(String[] args) {
        int n =-1;
        System.out.println(countWays(n));
    }
}
