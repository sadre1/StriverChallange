package Arrays;

public class Left_Rotate_an_Array_by_One {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int x=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]=x;
        return arr;

    }
}
