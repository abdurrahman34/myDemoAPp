package com.mycompany.app;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class App {
    
    public static int calculateSumOfOccurrences(int[] array1, int[] array2, int num1, int num2) {
        // Convert arrays to ArrayLists for easy count operation
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : array1) {
            list1.add(num);
        }
        
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            list2.add(num);
        }
        
        // Count occurrences of num1 in array1 and num2 in array2
        int count1 = Collections.frequency(list1, num1);
        int count2 = Collections.frequency(list2, num2);
        
        // Return the sum of occurrences
        return count1 + count2;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 1, 2, 1};
        int[] array2 = {1, 3, 3, 3, 4, 4, 3};
        
        int num1 = 1; // The number to count in the first array
        int num2 = 3; // The number to count in the second array
        
        int result = calculateSumOfOccurrences(array1, array2, num1, num2);
        System.out.println("The sum of occurrences of " + num1 + " in array1 and " + num2 + " in array2 is: " + result);
    }
}
