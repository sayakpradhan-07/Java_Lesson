package com.java.sayak;

import java.util.*;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int r = n % 2;
            binary.append(r);
            n /= 2;
        }

        // Reverse the binary string to get the correct representation
        binary.reverse();

        System.out.println(binary.toString());
    }
}