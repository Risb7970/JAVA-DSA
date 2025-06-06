package DynamicProgramming;

public class Fibonacii {
    public static int fib(int n,int f[]){ //Memoization
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0) return f[n];
        f[n] = fib(n-1,f) + fib(n-2,f);
        return f[n];
    }

    public static int fibTab(int n , int ful[]){
         ful[0]=0;
         ful[1]=1;
         for(int i=2; i<=n; i++){
             ful[n]=ful[n-1]+ful[n-2];
         }
         return ful[n];
    }

    public static void main(String[] args) {
        int n =5;
        int f[] = new int[n+1];
        System.out.println(fib(n,f));
        System.out.println(fibTab(n,f));
    }
}
