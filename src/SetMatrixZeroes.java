public class SetMatrixZeroes {


}
class Solution {

    public static void zerofull(int x , int y,int matrix[][]){
        for(int i = 0;i< matrix[0].length ;i++){
            if(matrix[x][i]!=0)
                matrix[x][i]=-1;
        }
        for(int j=0;j<matrix.length;j++)
        {
            if(matrix[j][y]!=0)
                matrix[j][y]=-1;
        }
    }
//
//Better solution implementing row and column array to store the index where the values are zero
public void setZeroes(int[][] matrix) {
    // Write your code here..
    int row [] = new int[matrix.length];
    int column[] = new int[matrix[0].length];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==0)
            {    row[i]=1;
                column[j]=1;
            }

        }
    }

    for(int i=0;i<row.length;i++){
        for(int j=0;j<column.length;j++){
            if(row[i]==1 || column[j]==1){
                matrix[i][j]=0;
            }
        }


    }

}
}
