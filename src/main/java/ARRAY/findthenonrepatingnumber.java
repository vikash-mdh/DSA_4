package ARRAY;
import java.util.HashMap;
import java.util.Map;
public class findthenonrepatingnumber {
        public static void main(String[] args) {
            int[] array = {9, 4, 9, 6, 7, 4}; // Example array

            int result = findFirstNonRepeating(array);

            if (result != -1) {
                System.out.println("The first non-repeating element is: " + result);
            } else {
                System.out.println("There is no non-repeating element.");
            }
        }

        public static int findFirstNonRepeating(int[] array) {
            // Create a HashMap to store the frequency of each element
            Map<Integer, Integer> elementCount = new HashMap<>();

            // Traverse the array and count the occurrences of each element
            for (int num : array) {
                elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
            }

            // Traverse the array again to find the first non-repeating element
            for (int num : array) {
                if (elementCount.get(num) == 1) {
                    return num; // Return the first non-repeating element
                }
            }

            return -1; // If no non-repeating element is found, return -1
        }
    }


