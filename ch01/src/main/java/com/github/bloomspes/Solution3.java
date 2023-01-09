package com.github.bloomspes;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 app = new Solution3();

        app.run();
    }

    public void run() {
        // 0. Set up

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        // 1. Input

        for (int i = 0; i < numbers.length; i += 1) {
            numbers[i] = scanner.nextInt();
        }

        // 2. Process

        int result = maximum(numbers);

        // 3. Output

        System.out.println(result);
    }

    public int maximum(int[] numbers) {
        return maximum2(numbers);
    }

    public int maximum1(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Numbers required...");
        }

        int result = Integer.MIN_VALUE;

        for (int number : numbers) {
            result = Math.max(result, number);
        }

        return result;
    }

    public int maximum2(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Numbers required...");
        }

        return Arrays.stream(numbers).reduce(Integer.MIN_VALUE, Math::max);
    }

    public int maximum3(int[] numbers) {
        if (numbers.length != 3) {
            throw new RuntimeException("Length must be 3");
        }

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
