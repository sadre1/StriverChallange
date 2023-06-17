package Arrays;

public class Search_In_A_Sorted_2D_Matrix {
    public static boolean searchElement(int[][] MATRIX, int target) {

        // Write your code here.
        int address = 0;
        int start = 0;
        int j = 0;
        for (int i = 0; i < MATRIX.length; i++) {
            if (MATRIX[i][0] > target)
                break;

            start = i;

        }
        // System.out.println(start);
        for (int i = 0; i < MATRIX[0].length; i++) {
            if (MATRIX[start][i] == target)
                return true;
        }

        return false;
    }
}
