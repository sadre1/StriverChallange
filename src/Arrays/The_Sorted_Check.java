package Arrays;

public class The_Sorted_Check {

    public int SortedCheck(int arr[]){
        int low=0;
        int heigh=arr.length-1;
        while(low<heigh){
            if(arr[low]>arr[heigh])
                return 0;

            low++;
            heigh--;
        }
        return 1;
    }
}
