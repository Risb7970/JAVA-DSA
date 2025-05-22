package DynamicProgramming;

public class ClimbingStairs {
    public static int CountWays(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        return CountWays(n-1)+CountWays(n-2);
    }
    public static void main(String[] args) {
        int n=5; //n=3 -> & n=4 -> 5 => 8
        System.out.println(CountWays(n));
    }
}
