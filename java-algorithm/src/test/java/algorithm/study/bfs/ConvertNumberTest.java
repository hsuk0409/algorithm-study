package algorithm.study.bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ConvertNumberTest {

    @Test
    @DisplayName("프로그래머스 레벨2 숫자 변환하기 문제")
    public void convertNumber() {
        int x = 10;
        int y = 40;
        int n = 5;

        int result = convertNumberLoop(x, y, n);
        System.out.println("result: " + result);
    }

    private int convertNumberLoop(int x, int y, int n) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(x);
        visited.add(x);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; ++i) {
                Integer cur = queue.poll();
                if (cur == null) continue;

                if (cur == y) {
                    return count;
                }

                int plusCondition = cur + n;
                if (plusCondition <= y && !visited.contains(plusCondition)) {
                    queue.add(plusCondition);
                    visited.add(plusCondition);
                }

                int multipleTwoCondition = cur * 2;
                if (multipleTwoCondition <= y && !visited.contains(multipleTwoCondition)) {
                    queue.add(multipleTwoCondition);
                    visited.add(multipleTwoCondition);
                }

                int multipleThirdCondition = cur * 3;
                if (multipleThirdCondition <= y && !visited.contains(multipleThirdCondition)) {
                    queue.add(multipleThirdCondition);
                    visited.add(multipleThirdCondition);
                }
            }
            ++count;
        }

        return -1;
    }

}
