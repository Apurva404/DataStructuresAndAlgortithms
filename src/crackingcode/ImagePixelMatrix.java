package crackingcode;

public class ImagePixelMatrix {
    public int[][] rotateBy90AntiClockwise(int a[][]){
        int n = a.length;
        int[][] b = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j =0; j<n; j++){
                b[i][j] = a[j][n-1-i];
            }
        }
        return  b;
    }
}
