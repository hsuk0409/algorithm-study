package algorithm.study.sort.quick;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest_240216 {

    @Test
    @DisplayName("퀵소트 구현")
    public void testQuickSort() {
        int[] arr = { 5, 3, 2, 8, 4, 1, 9, 7 };

        quickSortRecursive(arr, 0, arr.length - 1);

        int[] arr2 = { 5, 3, 2, 8, 4, 1, 9, 7 };
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public void quickSortRecursive(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = partition(arr, start, end);

        quickSortRecursive(arr, start, pivot - 1);
        quickSortRecursive(arr, pivot + 1, end);
    }

    public int partition(int[] arr, int start, int end) {
        int i = start;
        for (int k = start; k < end; ++k) {
            if (arr[k] < arr[end]) {
                swap(arr, i, k);
                ++i;
            }
        }

        swap(arr, i, end);

        return i;
    }

    public void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
