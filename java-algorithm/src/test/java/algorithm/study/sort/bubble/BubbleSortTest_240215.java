package algorithm.study.sort.bubble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest_240215 {

    @Test
    @DisplayName("버블 정렬을 구현한다.")
    public void bubbleSort() {
        int[] numArr = {3, 5, 2, 9, 7, 4, 3, 1, 10};

        for (int i = 0; i < numArr.length - 1; ++i) {
            for (int k = 0; k < numArr.length - i - 1; ++k) {
                if (numArr[k] > numArr[k + 1]) {
                    int tmp = numArr[k];
                    numArr[k] = numArr[k + 1];
                    numArr[k + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(numArr));
    }

}
