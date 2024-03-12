package com.mycompany.app;

public class AppTest {
    
    // Test with normal arrays
    public static void testNormalCase() {
        int[] array1 = {1, 2, 3, 1, 4, 1};
        int[] array2 = {5, 3, 3, 3, 4};
        int num1 = 1;
        int num2 = 3;
        int expected = 6; // 3 occurrences of 1 in array1 and 3 occurrences of 3 in array2
        int result = App.calculateSumOfOccurrences(array1, array2, num1, num2);
        assert result == expected : "Normal case failed.";
    }
    
    // Test with empty arrays
    public static void testEmptyArrays() {
        int[] array1 = {};
        int[] array2 = {};
        int num1 = 1;
        int num2 = 3;
        int expected = 0; // No occurrences in empty arrays
        int result = App.calculateSumOfOccurrences(array1, array2, num1, num2);
        assert result == expected : "Empty arrays case failed.";
    }
    
    // Test with no occurrences
    public static void testNoOccurrences() {
        int[] array1 = {2, 4, 6};
        int[] array2 = {7, 8, 9};
        int num1 = 1;
        int num2 = 3;
        int expected = 0; // No occurrences of 1 or 3
        int result = App.calculateSumOfOccurrences(array1, array2, num1, num2);
        assert result == expected : "No occurrences case failed.";
    }
    
    // Test with all elements being the same
    public static void testAllSameElements() {
        int[] array1 = {1, 1, 1, 1};
        int[] array2 = {2, 2, 2, 2};
        int num1 = 1;
        int num2 = 2;
        int expected = 8; // 4 occurrences of 1 and 4 occurrences of 2
        int result = App.calculateSumOfOccurrences(array1, array2, num1, num2);
        assert result == expected : "All same elements case failed.";
    }
    
    // Test with negative numbers
    public static void testNegativeNumbers() {
        int[] array1 = {-1, -2, -3, -1, -4, -1};
        int[] array2 = {-5, -3, -3, -3, -4};
        int num1 = -1;
        int num2 = -3;
        int expected = 6; // 3 occurrences of -1 in array1 and 3 occurrences of -3 in array2
        int result = App.calculateSumOfOccurrences(array1, array2, num1, num2);
        assert result == expected : "Negative numbers case failed.";
    }
    
    // Main method to run the test cases
    public static void main(String[] args) {
        testNormalCase();
        testEmptyArrays();
        testNoOccurrences();
        testAllSameElements();
        testNegativeNumbers();
        System.out.println("All tests passed!");
    }
}
