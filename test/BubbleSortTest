import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = BubbleSort.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, sortedArray);
    }

    @Test
    public void testBubbleSortPerformance() {
        int[] array = generateLargeArray();
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Bubble Sort time: " + duration + " nanoseconds");
    }

    private int[] generateLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        return array;
    }
}
