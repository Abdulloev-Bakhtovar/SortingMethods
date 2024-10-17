import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = InsertionSort.insertionSort(array);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, sortedArray);
    }

    @Test
    public void testInsertionSortPerformance() {
        int[] array = generateLargeArray();
        long startTime = System.nanoTime();
        InsertionSort.insertionSort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Insertion Sort time: " + duration + " nanoseconds");
    }

    private int[] generateLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        return array;
    }
}
