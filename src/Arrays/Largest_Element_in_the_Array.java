package Arrays;

public class Largest_Element_in_the_Array {

    public int[] LargestElement(int[] a){
        int n =a.length;
        int max=a[0];
        int secondmax=Integer.MIN_VALUE;
        int min=a[0];
        int secondmin=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(max < a[i]){
                secondmax=max;
                max=a[i];
            }
            else if(a[i]<max && a[i]>secondmax)
            {
                secondmax=a[i];
            }

            if(min>a[i]){
                secondmin=min;
                min=a[i];
            }
            else if(a[i]>min && a[i]<secondmin){
                secondmin=a[i];
            }
        }

        return new int[]{secondmax,secondmin};
    }

}
