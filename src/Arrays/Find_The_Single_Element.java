package Arrays;

public class Find_The_Single_Element {
    public static int getSingleElement(int []arr){
        // Write your code here.i
        if(arr.length==1)
            return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2])
        {
            return arr[arr.length-1];
        }
        for(int i=1;i<arr.length;i+=2){
            if(arr[i-1]!=arr[i]){
                return arr[i-1];
            }

        }
        return 0;

    }
}
