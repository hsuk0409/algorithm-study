package algorithm.study;

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

    private int gcdOfBigInteger(int a, int b) {
        b = Math.min(a, b);
        a = Math.max(a, b);
        BigInteger aVal = BigInteger.valueOf(a);
        BigInteger bVal = BigInteger.valueOf(b);

        return aVal.gcd(bVal).intValue();
    }

    private int gcdOfMyLogic(int a, int b) {
        b = Math.min(a, b);
        a = Math.max(a, b);
        while (b != 0) {
            int n = a % b;
            a = b;
            b = n;
        }

        return a;
    }
}
