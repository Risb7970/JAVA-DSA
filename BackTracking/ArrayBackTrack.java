import java.util.*;
public class ArrayBackTrack{
    public static void Back(int arr[] , int i , int val){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i]=val;
        Back(arr,i+1,val+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Back(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}