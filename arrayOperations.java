import java.util.Arrays;
import java.util.Collections;

public class arrayOperations {
    public static void main(String[] args) {
        // Initialize the array with the given values
        Integer[] ten = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Compute the sum of the elements
        int sum = 0;
        for (int num : ten) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
        
        // Sort the elements in descending order
        Arrays.sort(ten, Collections.reverseOrder());
        
        // Replace 100 with 1000
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 100) {
                ten[i] = 1000;
                break;
            }
        }
        
        // Print the sorted array
        System.out.println("Sorted array in descending order with 100 replaced by 1000: " + Arrays.toString(ten));
    }
}
