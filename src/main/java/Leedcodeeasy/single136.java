package Leedcodeeasy;

import java.util.Scanner;

class Solution{
    public static int singleNumber(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum^=arr[i];
        }
        return sum;
    }

}

public class single136 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.singleNumber(nums);
        System.out.println(result);


    }
}
