package ARRAY;

public class TripletSum {
    public static int countTriplets(int[] arr, int n, int x) {
        int count = 0;

        // Iterate through all possible triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the sum of the triplet equals x
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }

        return count;  // Return the total count of triplets
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 5, 3, 2};  // Example array
        int x = 10;  // Desired sum
        int n = arr.length;

        // Count and print the number of triplets
        int result = countTriplets(arr, n, x);
        System.out.println("Number of triplets with sum " + x + ": " + result);
    }
}
