package TWODARRAY;

import java.util.Scanner;

public class transposematrix {
    public static  void printt(int arr[][]){
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printt(arr);
        int n = arr.length; //, m = arr[0].length;
        // transpose matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        printt(arr);

        }

    }

