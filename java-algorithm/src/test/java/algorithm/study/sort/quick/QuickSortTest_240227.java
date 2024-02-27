package algorithm.study.sort.quick;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest_240227 {

    @Test
    @DisplayName("[240227] 퀵소트 구현 연습")
    public void test() {
        int[] arr = { 5, 3, 2, 8, 4, 1, 9, 7 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int i = left;

        for (int k = left; k < right; ++k) {
            if (arr[k] < arr[right]) {
                mySwap(arr, i, k);
                ++i;
            }
        }

        mySwap(arr, i, right);

        return i;
    }

    private void mySwap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
