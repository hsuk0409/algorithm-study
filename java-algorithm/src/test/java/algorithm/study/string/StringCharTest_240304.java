package algorithm.study.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCharTest_240304 {

    @Test
    @DisplayName("문자열 뒤집기 (char 다루기)")
    public void stringCharTest() {
        String s = "Hello, im justin.";
        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; --i) {
            sb.append(chars[i]);
        }
        System.out.println(sb);
        assertThat(sb.toString()).isEqualTo(".nitsuj mi ,olleH");
    }

    @Test
    @DisplayName("단어 뒤집기")
    public void reverseWordTest() {
        String s = "Hello, im justin.";
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; --i) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        System.out.println(sb);
        assertThat(sb.toString()).isEqualTo("justin. im Hello,");
    }

}
