package com.github.bloomspes;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        double reciprocal = 1.0 / value;

        System.out.println("Binary: " + Integer.toString(value, 2));
        System.out.println("Octal: " + Integer.toString(value, 8));
        System.out.println("Hexadecimal: " + Integer.toString(value, 16));

        System.out.printf("Hexadecimal floating point: %a\n", reciprocal);
    }
}
