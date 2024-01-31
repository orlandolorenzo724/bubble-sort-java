import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    /**
     * Sorts a list of integers using the bubble sort algorithm.
     *
     * @param integerList The list of integers to be sorted.
     */
    public static void sort(List<Integer> integerList) {

        // Outer loop: controls the number of passes
        for (int lastUnsortedIndex = integerList.size() - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            // Inner loop: compares and swaps adjacent elements
            for (int i = 0; i < lastUnsortedIndex; i++) {

                // Compare adjacent elements
                if (integerList.get(i) > integerList.get(i + 1)) {
                    // Swap elements if they are in the wrong order
                    swap(integerList, i, i + 1);
                }
            }
        }
    }

    /**
     * Swaps two elements in the given list.
     *
     * @param integerList The list in which elements are to be swapped.
     * @param i           The index of the first element.
     * @param j           The index of the second element.
     */
    private static void swap(List<Integer> integerList, Integer i, Integer j) {
        if (i.equals(j))
            return;

        // Perform the swap using a temporary variable
        Integer temp = integerList.get(i);
        integerList.set(i, integerList.get(j));
        integerList.set(j, temp);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
        System.out.println("Unordered list: " + integerList);
        BubbleSort.sort(integerList);
        System.out.println("Ordered list: " + integerList);
    }
}