package crackingcode;

public class UpdateMatrixHavingZero {
    public int[][] updateMatrix(int A[][]){
        int n = A.length;
        int row =0, column =0 ;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]== 0){
                    row= i; column=j;
                    break;
                }
            }
        }
        for(int k=0;k<n;k++){
            A[row][k] = 0;
            A[k][column] =0;
        }

        return A;
    }
}
