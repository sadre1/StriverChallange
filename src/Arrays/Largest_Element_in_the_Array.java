package Arrays;

public class Largest_Element_in_the_Array {

    public int LargestElement(int arr[]){
        int max= Integer.MIN_VALUE;

        for(int x:arr){
            if(max<x)
                max=x;
        }
        return max;

    }
}
