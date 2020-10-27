


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayEx2TEST.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayEx2TEST
{
    @Test
    public void testSort() {
        // test a basic sort
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        ArrayEx2.sort(arr);
        assertArrayEquals(new int[] {1, 3, 4, 4, 5, 7, 9}, arr);
    }
    
    @Test
    public void testSwap() {
        // swap 0 and 1
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        ArrayEx2.swap(arr, 0, 1);
        assertArrayEquals(new int[] {9, 3, 7, 4, 5, 1, 4}, arr);
        
        // should have no effect
        ArrayEx2.swap(arr, 3, 3);
        assertArrayEquals(new int[] {9, 3, 7, 4, 5, 1, 4}, arr);
        
        // swap 3 and 1
        ArrayEx2.swap(arr, 3, 1);
        assertArrayEquals(new int[] {9, 4, 7, 3, 5, 1, 4}, arr);
    }
    
    @Test
    public void testSwapAndDouble() {
         // swap and double 0 and 1
         int[] arr = {3, 9, 7, 4, 5, 1, 4};
         ArrayEx2.swapAndDouble(arr, 0, 1);
         assertArrayEquals(new int[] {18, 6, 7, 4, 5, 1, 4}, arr);
         
         // swap the same number, should only double it once
         ArrayEx2.swapAndDouble(arr, 2, 2);
         assertArrayEquals(new int[] {18, 6, 14, 4, 5, 1, 4}, arr);
         
         // swap and double 6 and 4
         ArrayEx2.swapAndDouble(arr, 6, 4);
         assertArrayEquals(new int[] {18, 6, 14, 4, 8, 1, 10}, arr);
         
    }
    
    @Test
    public void testSwapAndMultiply() {
        // swap and double 0 and 1
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        ArrayEx2.swapAndMultiply(arr, 0, 1, 5);
        assertArrayEquals(new int[] {45, 15, 7, 4, 5, 1, 4}, arr);
         
        // swap first and last
        ArrayEx2.swapAndMultiply(arr, 0, 6, 2);
        assertArrayEquals(new int[] {8, 15, 7, 4, 5, 1, 90}, arr);
    }
    
    @Test
    public void testDoubleAll() {
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        ArrayEx2.doubleAll(arr);
        assertArrayEquals(new int[] {6, 18, 14, 8, 10, 2, 8}, arr);
    }
    
    @Test
    public void testMultiplyAll() {
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        ArrayEx2.multiplyAll(arr, 3);
        assertArrayEquals(new int[] {9, 27, 21, 12, 15, 3, 12}, arr);
        
        ArrayEx2.multiplyAll(arr, 10);
        assertArrayEquals(new int[] {90, 270, 210, 120, 150, 30, 120}, arr);
    }
    
    @Test
    public void testMultiplyAll2() {
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        int[] res = ArrayEx2.multiplyAll2(arr, 3);
        assertArrayEquals(new int[] {9, 27, 21, 12, 15, 3, 12}, res);
        // make sure we didn't change the original array
        assertArrayEquals(new int[] {3, 9, 7, 4, 5, 1, 4}, arr);
    }
    
    @Test
    public void testCountDivisible() {
        assertEquals(3, ArrayEx2.countDivisible(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 3));
        assertEquals(4, ArrayEx2.countDivisible(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 2));
        assertEquals(0, ArrayEx2.countDivisible(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }
    
    @Test
    public void testAllPos() {
        assertTrue(ArrayEx2.allPos(new int[] {2, 3, 4, 5, 6, 7, 8, 9}));
        assertFalse(ArrayEx2.allPos(new int[] {2, 3, 4, 0, 5, 6, 7, 8, 9}));
        assertFalse(ArrayEx2.allPos(new int[] {2, 3, 4, 5, 6, -7, 8, 9}));
    }
    
    @Test
    public void testAllAtLeastN() {
        assertTrue(ArrayEx2.allAtLeastN(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 2));
        assertFalse(ArrayEx2.allAtLeastN(new int[] {2, 3, 4, 0, 5, 6, 7, 8, 9}, 2));
        assertFalse(ArrayEx2.allAtLeastN(new int[] {2, 3, 4, 5, 6, -7, 8, 9}, -6));
    }
    
    @Test
    public void testAllPos2() {
        // TAs: LOOK AT THE CODE TO MAKE SURE THEY ARE CALLING allAtLeastN()
        assertTrue(ArrayEx2.allPos(new int[] {2, 3, 4, 5, 6, 7, 8, 9}));
        assertFalse(ArrayEx2.allPos(new int[] {2, 3, 4, 0, 5, 6, 7, 8, 9}));
        assertFalse(ArrayEx2.allPos(new int[] {2, 3, 4, 5, 6, -7, 8, 9}));
    }
    
    @Test
    public void testCountBetween() {
        assertEquals(4, ArrayEx2.countBetween(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 3, 6));
        assertEquals(0, ArrayEx2.countBetween(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 6, 3));
        assertEquals(0, ArrayEx2.countBetween(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 10, 20));
    }
    
    @Test
    public void testPosNegZero() {
        assertArrayEquals(new int[] {2, 1, 3}, ArrayEx2.posNegZero(new int[] {0, -1, 33, 7, -4, 11}));
        assertArrayEquals(new int[] {3, 0, 1}, ArrayEx2.posNegZero(new int[] {-33, 7, -4, -11}));
    }
    
    public static int[] filterLess(int[] arr, int max) {
        return new int[] {0};
    }
    
    @Test
    public void testSort2() {
        // test a basic sort
        int[] arr = {3, 9, 7, 4, 5, 1, 4};
        int[] res = ArrayEx2.sort2(arr);
        assertArrayEquals(new int[] {1, 3, 4, 4, 5, 7, 9}, res);
        // make sure we did not change arr
        assertArrayEquals(new int[] {3, 9, 7, 4, 5, 1, 4}, arr);
    }
    
    @Test
    public void testCountLonger() {
        String[] arr = {"dog", "bird", "cat", "koala", "cat", "dingo"};
        assertEquals(3, ArrayEx2.countLonger(arr, 3));
        assertEquals(0, ArrayEx2.countLonger(arr, 5));
    }
    
    @Test
    public void testMaxLen() {
        String[] arr = {"dog", "bird", "cat", "koala", "cat", "dingo"};
        assertEquals(5, ArrayEx2.maxLen(arr));
        
        String[] arr2 = {"dog", "bird", "barracuda", "cat", "koala", "cat", "dingo"};
        assertEquals(9, ArrayEx2.maxLen(arr2));
    }
    
    @Test
    public void testMaxLen2() {
        String[] arr = {"dog", "bird", "cat", "koala", "cat", null, "dingo"};
        assertEquals(5, ArrayEx2.maxLen2(arr));
        
        String[] arr2 = {"dog", "bird", "barracuda", null, "cat", "koala", "cat", "dingo"};
        assertEquals(9, ArrayEx2.maxLen2(arr2));
    }
    
    @Test
    public void sum() {
        assertEquals(0, ArrayEx2.sum(new int[0]));
        assertEquals(7, ArrayEx2.sum(new int[] {3, 4}));
        assertEquals(0, ArrayEx2.sum(new int[] {3, 4, -7}));
    }
    
    @Test
    public void maxRow() {
        int[][] grid = new int[][] {
            {1,2,3},
            {3,1},
            {7,-3,5,6},
            {0,1,2}
        };
        assertEquals(15, ArrayEx2.maxRow(grid));
    }
    
    
    @Test
    public void maxRowIndex() {
        int[][] grid = new int[][] {
            {1,2,3},
            {3,1},
            {7,-3,5,6},
            {0,1,2}
        };
        assertEquals(2, ArrayEx2.maxRowIndex(grid));
    }
}
