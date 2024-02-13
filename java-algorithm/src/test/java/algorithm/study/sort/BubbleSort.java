package algorithm.study.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    @DisplayName("버블 정렬을 구현한다.")
    public void bubbleSort() {
        int[] nums = {3, 5, 2, 9, 7, 4, 3, 1, 10};

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int k = 0; k < nums.length - i - 1; ++k) {
                if (nums[k] > nums[k + 1]) {
                    int tmp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
