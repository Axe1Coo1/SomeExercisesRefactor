package sort;

public class BubbleSortTwoDimensionalArray {
    static int[][] generateTwoDimensionalArray(int arrayLength) {
        int[][] array;
        array = new int[arrayLength][arrayLength];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * (1 - 10)) + 10;
            }
        }
        return (array);
    }


    static void outputTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
        }
    }

    public static void swap(int x, int y) {
        int a = x;
        x = y;
        y = a;
    }

    static int[][] bubbleSortTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                for (int k = 0; k < array[j].length - 1 ; k++) {
                    if (array[j][k] > array[j][k + 1]) {
                        int temp = array[j][j];
                        array[j][k] = array[j][k + 1];
                        array[j][k + 1] = temp;
//                        swap(array[i][j], array[i][j + 1]);
                    }
                }
            }
        }
        return (array);
    }
}
