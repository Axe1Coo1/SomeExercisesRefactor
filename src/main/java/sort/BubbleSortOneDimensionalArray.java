package sort;

public class BubbleSortOneDimensionalArray {

    static int[] generateArray(int arrayLenght) {
        int[] array;
        array = new int[arrayLenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (1 - 10)) + 10;
        }
        return (array);
    }


    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return (array);
    }
}
