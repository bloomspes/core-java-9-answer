package com.github.bloomspes;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numbertwo = scanner.nextInt();
        int numberthree = scanner.nextInt();

        System.out.println("Maximum number with ?: " +
                (numberOne >= numbertwo ? numberOne : numbertwo >= numberthree
                        ? numbertwo : numberthree));

        System.out.println("Maximum number with Math.max: " +
                Math.max(numberOne, Math.max(numbertwo, numberthree)));
    }
}
