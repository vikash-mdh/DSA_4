package TWODARRAY;



public class twomatrixadd {
    public static void main(String[] args) {
        int a[][] = {{1,9,6},{9,7,4},{8,5,6}};
        int b[][] = {{9,3,7},{4,6,7},{3,9,6}};
        int n = a.length;
        int m = b.length;
        int res[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");

            }
            System.out.println();
        }

    }
}
