public class RotatedSortedSearch {

    public static int search(int arr[] , int target , int si , int ei){
     if(si>ei){
        return -1;
     }

        int mid = si + (ei-si)/2;


        //case found 
        if(arr[mid] ==target){
            return mid;
        }

        //target on line1
        if(arr[si]<=arr[mid]){
         //case a: Search on Left
         if(arr[si]<=target && target<=arr[mid]){
            return search(arr, target, si, mid-1);
         }
         //case b : Search on left
         else{
            return search(arr, target, mid+1, ei);
         }
        }
        //on line2
        else{
         //case c : search on right of l2
         if(arr[mid]<=target && target<=arr[ei]){
           return search(arr, target, mid+1, ei);
         }
         //case d : search on left of l2
         return search(arr, target, si, mid-1);
        }
   
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,8,1,2,3};
        int target = 3;
        int targetIdx=search(arr, target, 0, arr.length-1);
        System.out.println(targetIdx);
    }
}
