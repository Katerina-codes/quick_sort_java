package main.sorter;

import java.util.List;

public class Sorter {
    public List<Integer> quickSort(List<Integer> unsortedList) {
        sort(unsortedList, 0, unsortedList.size() - 1);
        return unsortedList;
    }

    private void sort(List<Integer> unsortedList, int firstElement, int lastElement) {

        if (firstElement < lastElement) {

            int p = partition(unsortedList, firstElement, lastElement);

            sort(unsortedList, firstElement, p);
            sort(unsortedList, p + 1, lastElement);
        }
    }

    private int partition(List<Integer> unsortedList, int firstElement, int lastElement) {
        Integer pivot = unsortedList.get(firstElement);
        int i = firstElement - 1;
        int j = lastElement + 1;

        while (true) {

            while (unsortedList.get(i += 1) < pivot) {
            }
            while (unsortedList.get(j -= 1) > pivot) {
            }
            if (i >= j) {
                return j;
            } else {
                Integer previousValue = unsortedList.get(i);
                unsortedList.set(i, unsortedList.get(j));
                unsortedList.set(j, previousValue);
            }
        }
    }
}