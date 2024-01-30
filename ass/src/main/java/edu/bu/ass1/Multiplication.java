package edu.bu.ass1;

public class Multiplication {
    public static void main(String[] args) {
        multiplication(12);
    }

    /**
     * print a multiplication up to n
     */
    public static void multiplication(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%-10s", i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
