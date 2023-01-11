package com.github.bloomspes;

import java.math.BigInteger;

public class Solution6 {
    public static void main(String[] args) {
        Solution6 app = new Solution6();

        app.run();
    }

    public void run() {
        BigInteger result = factorial(1000);

        System.out.println(result);
    }


    public BigInteger factorial(Integer number) {
        BigInteger factorial = BigInteger.ONE;

        if (number.equals(0)) {
            return BigInteger.valueOf(number);
        }

        if (number < 0) {
            throw new RuntimeException("number should be positive...");
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
