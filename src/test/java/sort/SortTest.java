package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static sort.BubbleSortOneDimensionalArray.bubbleSort;
import static sort.BubbleSortOneDimensionalArray.generateArray;
import static sort.BubbleSortTwoDimensionalArray.generateTwoDimensionalArray;
import static sort.MergeSort.generateArrayList;
import static sort.MergeSort.mergeSort;
import static sort.StructureTwoDimensionArray.makeStructureArray;


public class SortTest {

    @Test
    public void generateSmallArray() {
        int[] c = generateArray(20);
        if (c.length != 20) {
            fail("Function 'generateArray' incorrect");
        }
    }

    @Test
    public void bubbleSortSmallArray() {
        int[] c = generateArray(20);
        bubbleSort(c);
        assertTrue("Function 'bubbleSort' incorrect", isSorted(c));
    }

    @Test
    public void bubbleSortLargeArray() {
        int[] c = generateArray(100_000);
        bubbleSort(c);
        assertTrue("Function 'bubbleSort' incorrect", isSorted(c));
    }

    @Test
    public void generateLargeArray() {
        int[] c = generateArray(100_000);
        if (c.length != 100_000) {
            fail("Function 'generateArray' incorrect");
        }
    }

    @Test
    public void generateSmallTwoDimensionalArray() {
        int[][] c = generateTwoDimensionalArray(10);
        if (c.length != 10) {
            fail("Function 'GenerateLargeTwoDimensionalArrayTest' incorrect");
        }
    }

    @Test
    public void mergeSortArrayLarge() {
        ArrayList<Integer> c = generateArrayList(100_000);
        c = mergeSort(c);
        assertTrue("Function 'mergeSortArrayLarge' incorrect", isSorted(c));
    }

    @Test
    public void mergeSortArraySmall() {
        ArrayList<Integer> c = generateArrayList(10);
        c = mergeSort(c);
        assertTrue("Function 'mergeSortArraySmall' incorrect", isSorted(c));
    }
    @Test
    public void StructureTest(){
        for (int i = 2; i <= 20; i += 2) {

            makeStructureArray(i);
        }
    }

    private boolean isSorted(ArrayList<Integer> array) {
        List<Integer> sorted = new ArrayList<Integer>(array);
        Collections.sort(sorted);
        return array.equals(sorted);
    }


    private boolean isSorted(int[] array) {
        int[] sorted = new int[array.length];

        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);

        return Arrays.equals(sorted, array);
    }
}
