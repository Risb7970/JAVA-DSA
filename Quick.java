public class Quick{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
public static void quickSort(int arr[] , int si , int ei){
    if(si>=ei){
        return;
    }
  //last element
int pidx = partition(arr, si, ei);
quickSort(arr, si, pidx-1); //left part sorting
quickSort(arr, pidx+1, ei); //right part sorting
}

public static int partition(int arr[] , int si , int ei){
    int pivot = arr[ei];
    int i = si-1 ; //to make place for els smaller than pivot

    for(int j=si; j<ei; j++){
        if(arr[j]<= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    //swap
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
return i;
}

    public static void main(String args[]){
        int arr [] = {2,5,7,8,3,2,6,1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}