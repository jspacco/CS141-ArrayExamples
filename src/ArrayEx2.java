

/**
 * Write a description of class ArrayEx2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayEx2
{
    // sort the given array
    // you can use one of the sort algorithms from the slides
    // change the array
    public static void sort(int[] arr) {
        // your code here
    }
    
    
    // swap the int values at the two given indices
    public static void swap(int[] array, int index1, int index2) {
    	// your code here
    }
    
    

    //swap the integer values in the array at the specified indices after doubling them
    public static void swapAndDouble (int[] array, int index1, int index2){
    	// your code here
    }
    
    // swap the values at the two given indices and multiply each by n
    public static void swapAndMultiply(int[] array, int index1, int index2, int n) {
    	// your code here
    }
    
    
    // double all values of an array
    public static void doubleAll(int[] arr) {
    	// your code here
    }
    
    // multiply all the values of an array by n
    public static void multiplyAll(int[] arr, int n) {
    	// your code here
    }
    
    // return a NEW array that multiplies all of the values of the given array by n,
    // but does NOT CHANGE the original array
    public static int[] multiplyAll2(int[] arr, int n) {
    	// replace this with your code
    	return new int[1];
    }
    
    // count the number of values in arr that are above n
    public static int countAbove(int[] arr, int n) {
        // replace with your code
    	return -1;
    }
    
    // count the number of values in arr that are positive and divisihble by n
    public static int countDivisible(int[] arr, int n) {
    	// replace with your code
    	return -1;
    }
    
    // return true if all the values are positive, and false otherwise
    public static boolean allPos(int[] arr) {
    	// replace with your code
    	return false;
    }
    
    // return true if all the values are at least n, and false otherwise
    public static boolean allAtLeastN(int[] arr, int n) {
    	// replace with your code
    	return false;
    }
    
    // return true if all the values are positive, and false otherwise
    // do this by calling the allAtLeastN function above (figure out a value for the n parameter)
    public static boolean allPos2(int[] arr) {
    	// replace with your code
    	return false;
    }
    
    // count the number of values in arr that are at least lo and at most hi
    public static int countBetween(int[] arr, int lo, int hi) {
    	// replace with your code
    	return -1;
    }
    
    // return an array of size 3 containing the number of negative, zero, and positive values in the array, in that order
    public static int[] posNegZero(int[] arr) {
        // replace with your code
    	return new int[] {0, 0, 0};
    }
    
    // return a new array containing only values that are less than max
    // HINT: You cannot easily remove elements from an array, so create a new array and copy over only the values
    // that are less than max
    public static int[] filterLess(int[] arr, int max) {
        return new int[] {0};
    }
    
    // return a NEW array that is a copy of the given array, but sorts all of the values
    // DO NOT CHANGE the original array
    // you can use one of the sort algorithms from the class slides
    // HINT: call the sort method that you already wrote on a copy of arr
    public static int[] sort2(int[] arr) {
        // replace with your code
    	return new int[] {0};
    }
    
    // return the number of strings in arr that are longer than len
    public static int countLonger(String[] arr, int len) {
        // replace with your code
    	return -1;
    }
    
    // return the length of the longest String in arr
    public static int maxLen(String[] arr) {
    	// replace with your code
    	return -1;
    }
    
    // return the length of the longest String in arr
    // some of the String values may be null; treat those as of length zero
    // note that if you try to call the length() on a null String, you will get a null pointer exception, so check that String is not null first
    public static int maxLen2(String[] arr) {
    	// replace with your code
    	return -1;
    }
    
    // return the sum of all of the values in the the given 1D array
    public static int sum(int[] arr) {
    	// replace with your code
    	return -1;
    }
    
    // return the largest sum of the values within a single row, from among all the rows in the given grid
    // the grid may not be regularly shaped (i.e. it might not have the same number of columns in each row)
    // e.g. {{1,2,3},{3,1}} has two rows; row 0 {1,2,3} sums up to 6 and row 1 {3,1} sums up to 4, so we would return 6
    // For full credit: Use the sum() function you wrote above (note that each row in a 2D array is a 1D array)
    public static int maxRow(int[][] grid) {
    	// replace with your code
    	return -1;
    }
    
    // return the index of the row containing the largest sum of the values among all rows in the given grid
    // the grid may not be regularly shaped (i.e. it might not have the same number of columns in each row)
    // e.g. {{1,2,3},{3,1}} has two rows; row 0 {1,2,3} sums up to 6 and row 1 {3,1} sums up to 4, so we would return 0
    // For full credit: Use the sum() function you wrote above (note that each row in a 2D array is a 1D array)
    public static int maxRowIndex(int[][] grid) {
    	// replace with your code
    	return -1;
    }

}
