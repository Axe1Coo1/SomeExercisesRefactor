package randomElementAndSumOfString;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static randomElementAndSumOfString.ArraysAndSumOfString.calculateSum;


public class PackageTest {

    @Test
    public void calcSum() {
        String x = "1234312341234234567";
        assertEquals(60, calculateSum(x), 0.0);
    }

    @Test
    public void getRandomElement() {
        int[] values = {1, 2, 3};
        int[] keys = {1, 2, 10};

        ArraysAndSumOfString arr1 = new ArraysAndSumOfString(values, keys);


        for (int i = 0; i < 100000; i++) {
            int acc = arr1.randomElement();
            System.out.println(acc);
            if (Arrays.binarySearch(values, acc) < 0) {
                fail("Function 'randomElement' incorrect");
            }

        }


    }


}
