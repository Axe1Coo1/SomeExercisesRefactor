package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static sort.BubbleSortOneDimensionalArray.generateArray;
import static sort.BubbleSortOneDimensionalArray.bubbleSort;
import static sort.BubbleSortTwoDimensionalArray.generateTwoDimensionalArray;


public class SortTest {

    @Test
    public void GenerateSmallArrayTest() {
        int[] c = generateArray(20);
        if (c.length != 20) {
            fail("Function 'generateArray' incorrect");
        }
    }

    @Test
    public void BubbleSortSmallArray() {
        int[] c = generateArray(20);
        bubbleSort(c);
        assertTrue("Function 'bubbleSort' incorrect", isSorted(c));
    }

    @Test
    public void BubbleSortLargeArray() {
        int[] c = generateArray(100_000);
        bubbleSort(c);
        assertTrue("Function 'bubbleSort' incorrect", isSorted(c));
    }

    @Test
    public void GenerateLargeArrayTest() {
        int[] c = generateArray(100_000);
        if (c.length != 100_000) {
            fail("Function 'generateArray' incorrect");
        }
    }

    @Test
    public void GenerateSmallTwoDimensionalArrayTest() {
        int[][] c = generateTwoDimensionalArray(10);
        if (c.length != 10) {
            fail("Function 'GenerateLargeTwoDimensionalArrayTest' incorrect");
        }
    }


    private boolean isSorted(int[] array) {
        int[] sorted = new int[array.length];

        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);

        return Arrays.equals(sorted, array);
    }
}
