package com.github.bloomspes;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 app = new Solution2();

        app.run();
    }

    public void run() {
        // 0. Set up
        Scanner scanner = new Scanner(System.in);

        // 1. Input
        Integer angle = scanner.nextInt();

        // 2. Process
        Integer result = normalization(angle);

        // 3. result
        System.out.println(result);
    }

    public Integer normalization(Integer angle) {
        return Math.floorMod(angle, 360);
    }
}
