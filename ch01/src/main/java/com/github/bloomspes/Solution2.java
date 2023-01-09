package com.github.bloomspes;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angle = scanner.nextInt();

        System.out.println(angle % 360);

        System.out.println(
                "Math.floorMod(angle, 360) is " + Math.floorMod(angle, 360)
        );
    }
}
