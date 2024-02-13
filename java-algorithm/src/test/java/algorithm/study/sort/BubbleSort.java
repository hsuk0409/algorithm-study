package algorithm.study.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    @DisplayName("버블 정렬을 구현한다.")
    public void bubbleSort() {
        int[] nums = {3, 5, 2, 9, 7, 4, 3, 1, 10};

        for (int i = 0; i < nums.length; ++i) {
            for (int k = 1; k < nums.length; ++k) {
                if (nums[k - 1] > nums[k]) {
                    int tmp = nums[k - 1];
                    nums[k - 1] = nums[k];
                    nums[k] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
