package test.sorter;

import main.sorter.Sorter;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class SorterTest {

    @Test
    public void sortsListOfFourNumbers() {
        Sorter sorter = new Sorter();
        List<Integer> unsortedList = asList(3, 2, 1, 0);
        List<Integer> sortedList = asList(0, 1, 2, 3);

        assertEquals(sortedList, sorter.quickSort(unsortedList));
    }
}
