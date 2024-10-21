package SORTINGALGORITHM;

public class Arrysortedornot {
    public static void main(String[] args) {
        int [] arr = {9,2,3,5,11};
        int n = arr.length;
        boolean flag = true;  // it means array is sotted hai
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i+1])
                flag = false;
            break;
        }
        if(flag == true){
            System.out.println("Arrays is sorted hai");
        }else{
            System.out.println("Arrays is not sotted hai");
        }
    }
}
