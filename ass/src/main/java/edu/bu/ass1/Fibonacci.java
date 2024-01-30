package edu.bu.ass1;

import java.math.BigInteger;

public class Fibonacci {
    public static void fibonacci(int n) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.println("1");
        }
        if (n >= 2) {
            System.out.printf("1, 1%s", n == 2 ? "." : ",");
        }
        BigInteger pre = BigInteger.valueOf(1);
        BigInteger curr = BigInteger.valueOf(1);
        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%d+%d=%d%s\n", pre, curr, pre.add(curr),
                    i == n - 3 ? "." : ",");
            BigInteger temp = curr.add(pre);
            pre = curr;
            curr = temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(100);
    }
}

