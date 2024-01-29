import java.util.ArrayList;
import java.util.List;

public class Sorter {
    static void sortInts(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int value = list.get(i);

            // Move elements greater than value to higher indices.
            int j = i - 1;
            while (j >= 0 && list.get(j) > value) {
                list.set(j + 1, list.get(j));
                j--;
            }

            // Put value to the left of the greater elements.
            list.set(j + 1, value);
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(3, 12, 7, 4));
        System.out.println(ints);
        sortInts(ints);
        System.out.println(ints);
    }
}
