package sort;

public class StructureTwoDimensionArray {
    public static void makeStructureArray(int arrayLength) {
        System.out.println("Array size = " + arrayLength + "*" + arrayLength);
        int size = arrayLength * arrayLength;

        int[][] arr = new int[arrayLength][arrayLength];

        int x = 0;
        int y = 1;

        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i == 0 || i == arr.length - 1) {
                    arr[i][j] = 1;
                } else if ((j >= x && j <= arr.length - y)) {
                    arr[i][j] = 1;

                }
            }
            if (flag == 1) {
                x -= 1;
                y -= 1;
            } else if (y == arr.length / 2) {
                flag = 1;
                continue;
            } else {
                x += 1;
                y += 1;
            }


        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
