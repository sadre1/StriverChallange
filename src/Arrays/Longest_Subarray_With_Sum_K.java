package Arrays;

public class Longest_Subarray_With_Sum_K {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        // Write your code here
        int sum = 0;
        int maxlength = 0;
        int i = 0;
        int j = 0;
        while (j < a.length) {
            sum += a[j];
            if (sum == k) {
                maxlength = Math.max(maxlength, j - i + 1);
            }
            if (sum > k || sum < 0) {
                i++;
                j = i;
                sum = 0;
            } else {

                j++;
            }
        }
        return maxlength;

    }
}
