package java_question;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSortArray {
    public static void main(String[] args) {
        Integer[] arr = {51, 15, 99, 33, 67};

        // Sort in reverse order
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array in reverse order: " + Arrays.toString(arr));
    }
}

