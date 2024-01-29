import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    private <T extends Comparable<T>>  boolean  isSorted(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void sortEmptyIntList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        Sorter.sort(emptyList);
        assertEquals(0, emptyList.size());
    }

    @Test
    public void sortLength1IntList() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1));
        Sorter.sort(list);
        assertEquals(1, list.size());
    }

    @Test
    public void sortLength2IntList() {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 1));
        Sorter.sort(list);
        assertEquals(2, list.size());
        assertTrue(isSorted(list));
    }
}