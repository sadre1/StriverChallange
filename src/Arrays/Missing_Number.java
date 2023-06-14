package Arrays;

public class Missing_Number {

    public static int missingNumber(int []a, int N) {
        int sum=1;
        for(int i = 0 ; i<N-1;i++){
            sum=sum^(i+1)^a[i];
        }
        sum=sum^N;
        return sum-1;
    }
}
