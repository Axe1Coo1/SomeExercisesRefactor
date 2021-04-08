package algorifms;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchAlgorithm {

    public static List<Integer> binarySearch(int[] array, int item) {
        System.out.println();
        List<Integer> rez = new ArrayList<>();
        if (item > array[array.length / 2]) {
            for (int i = array.length / 2; i < array.length; i++) {
                if (array[i] == item) {
                    System.out.println("Номер элемента в массиве: " + i);
                    rez.add(i);
                }
            }
        } else if (item < array[array.length / 2]) {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] == item) {
                    System.out.println("Номер элемента в массиве: " + i);
                    rez.add(i);
                }
            }
        } else {
            System.out.println("Номер элемента в массиве: " + array.length / 2);
            rez.add(array.length / 2);
        }
        return rez;
    }
}

