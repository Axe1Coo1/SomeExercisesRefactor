package randomElementAndSumOfString;

import java.util.ArrayList;
import java.util.Random;

public class ArraysAndSumOfString {
    int[] values;
    int[] keys;

    public ArraysAndSumOfString(int[] values, int[] keys) {
        this.values = values;
        this.keys = keys;
    }


    public int randomElement() {

        int x = 0;
        for (int i = 0; i < values.length; i++) {
            x += values[i] * keys[i];
        }


        ArrayList resArr = new ArrayList();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < keys[i]; j++) {
                resArr.add(values[i]);
            }
        }
        Random rand = new Random();
        int randomElement = (int) resArr.get(rand.nextInt(resArr.size()));

        int res = (int)resArr.get(randomElement);
        return res;
    }

    public static int calculateSum(String input) {
        int x = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            x += Character.getNumericValue(chars[i]);
        }
        return x;
    }
}
