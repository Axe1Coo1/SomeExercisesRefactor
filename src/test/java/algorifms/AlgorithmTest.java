package algorifms;

import org.junit.Test;

import java.util.List;

import static algorifms.BinarySearchAlgorithm.binarySearch;
import static org.junit.Assert.fail;
import static sort.BubbleSortOneDimensionalArray.generateArray;
import static sort.BubbleSortOneDimensionalArray.outputArray;

public class AlgorithmTest {
    @Test
    public void binarySearchTest() {
        int[] arr = generateArray(100);
        outputArray(arr);
        List<Integer> rez = binarySearch(arr, 2);
        System.out.println(rez);
        for (int i = 0; i < rez.size(); i++) {
            if (arr[rez.get(i)] != 2) {
                fail("Function 'binarySearch' incorrect");
            }
        }

    }
}
