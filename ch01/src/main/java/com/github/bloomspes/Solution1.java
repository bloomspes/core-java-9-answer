package com.github.bloomspes;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 app = new Solution1();

        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        String result1 = convertToBinary(value);
        String result2 = convertToOctal(value);
        String result3 = convertToHexaDecimal(value);
        String result4 = reciprocal(value);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public String convertToBinary(int value) {
        return Integer.toString(value, 2);
    }

    public String convertToOctal(int value) {
        return Integer.toString(value, 8);
    }

    public String convertToHexaDecimal(int value) {
        return Integer.toString(value, 16);
    }

    public String reciprocal(int value) {
        double reciprocal = 1.0 / value;

        return String.format("%a\n", reciprocal);
    }
}
