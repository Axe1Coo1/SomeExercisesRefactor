package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static ArrayList<Integer> generateArrayList(int arrLength) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = arrLength; i > 0; i--) {
            arr.add(i);
        }
        return arr;
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> res = new ArrayList<Integer>();
        res.addAll(left);
        res.addAll(right);

        int countL = 0;
        int countR = 0;

        for (int i = 0; i < res.size(); i++) {
            if (countL > left.size() - 1) {
                res.set(i, right.get(countR));
                countR++;
            } else if (countR > right.size() - 1) {
                res.set(i, left.get(countL));
                countL++;
            } else if (left.get(countL) < right.get(countR)) {
                res.set(i, left.get(countL));
                countL++;
            } else if (right.get(countR) < left.get(countL)) {
                res.set(i, right.get(countR));
                countR++;
            } else if (right.get(countR).equals(left.get(countL))) {
                res.set(i, left.get(countL));
                res.set(i + 1, right.get(countR));
                i++;
                countL++;
                countR++;
            }
        }
        return (res);
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> items) {

        if (items.size() < 2) {
            return (items);
        } else {
            int middle = items.size() / 2;

            ArrayList<Integer> left = new ArrayList<Integer>(middle);
            ArrayList<Integer> right = new ArrayList<Integer>(items.size() - middle);

            for (int i = 0; i < middle; i++) {
                left.add(items.get(i));
            }
            for (int i = middle; i < items.size(); i++) {
                right.add(items.get(i));
            }

            left = mergeSort(left);
            right = mergeSort(right);

            return (ArrayList<Integer>) merge(left, right);
        }
    }
}
