import java.util.Arrays;
import java.util.Scanner;

public class Pracctice {
    public static void main(String[] args) {
//        String ans = "000000123456900";
//        for(int i=0; i<ans.length(); i++){
//            if(!(ans.charAt(i)=='0')){
//                System.out.println(ans.substring(i,ans.length()));
//                break;
//            }
//        }

        //plallindrome
//        int ans = 12321;
//        int temp = ans;
//        int rev=0;
//        while(temp!=0){
//            int last = temp%10;
//            rev= rev*10 + last;
//            temp/=10;
//        }
//        System.out.println(ans==rev);

        //prime or not
        int n =7;
        if (n <= 1) System.out.println(false);// 0 and 1 are not prime
        if (n == 2) System.out.println(true);  // 2 is the only even prime number
        if (n % 2 == 0) System.out.println(false); // other even numbers are not prime

        for (int i = 3; i * i <= n; i += 2) { // check only odd divisors
            if (n % i == 0)
                System.out.println(false);
        }
        System.out.println(true);

        //armstrong number
        int original = 371;
        int temp = original;
        int sum = 0;
        int digits = String.valueOf(original).length();

        while (original > 0) {
            int digit = original % 10;
            sum += Math.pow(digit, digits);
            original /= 10;
        }

        System.out.println(sum == temp);

//        //leap year or not
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a year: ");
//        int year = sc.nextInt();
//
//        // Leap year condition
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//            System.out.println(year + " is a Leap Year.");
//        else
//            System.out.println(year + " is NOT a Leap Year.");

        int arr[] = {1,2,3,4};
        int pro = 1;
        for(int i : arr){
            pro*=i;
        }
        for(int i=0; i<arr.length; i++){
            arr[i]=pro/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
