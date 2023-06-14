package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Remove_Duplicates_from_Sorted_Array {


    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        if(n==2 && arr.get(0)!=arr.get(1))
            return 2;
        else if(n==2 && arr.get(0)==arr.get(1))
            return 1;
        int j=1;
        int i;
        for(i=0 ; i<n &&j<n;){
            if(arr.get(i)!=arr.get(j)){
                i++;
                Collections.swap(arr, i, j);
                j++;
            }
            else{
                j++;
            }

        }
        return i+1;
    }
}
