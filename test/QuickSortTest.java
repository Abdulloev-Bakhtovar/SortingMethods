import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, sortedArray);
    }

    @Test
    public void testQuickSortPerformance() {
        int[] array = generateLargeArray();
        long startTime = System.nanoTime();
        QuickSort.quickSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Quick Sort time: " + duration + " nanoseconds");
    }

    private int[] generateLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        return array;
    }
}
