package Arrays;

public class Consicutiveones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone=0;
        int max=0;
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i]==1)
                maxone++;
            else{
                if(maxone>max){
                    max=maxone;
                    maxone=0;
                }
                else{
                    maxone=0;
                }
            }

        }
        if(maxone>max){
            max=maxone;
            maxone=0;
        }
        return max;

    }
}
