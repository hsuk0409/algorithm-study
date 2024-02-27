package algorithm.study.sort.gcd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class GcdTest_240215 {

    @Test
    @DisplayName("최대공약수/최소공배수 구하기")
    public void gcd() {
        int a = 55;
        int b = 79;

        int result1 = gcdOfBigInteger(a, b);
        int result2 = gcdOfMyLogic(a, b);

        System.out.println("============= GCD =============");
        System.out.println("BigInteger value: " + result1);
        System.out.println("My logic value: " + result2);

        System.out.println("============= LCM =============");
        System.out.println((a * b) / result2);
    }

    @Test
    @DisplayName("gcd 값 테스트")
    public void gcd2() {
        int a = 5;
        int b = 13;

        int result = gcdOfMyLogic(a, b);
        System.out.println("============= GCD =============");
        System.out.println("BigInteger value: " + result);
    }

    private int gcdOfBigInteger(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        BigInteger aVal = BigInteger.valueOf(a);
        BigInteger bVal = BigInteger.valueOf(b);

        return aVal.gcd(bVal).intValue();
    }

    private int gcdOfMyLogic(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int n = a % b;
            a = b;
            b = n;
        }

        return a;
    }
}
