package edu.bu.ass1;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static void judge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a year like 2024");
        String year = scanner.nextLine();
        System.out.printf("%s %s a leap year", year, isLeapYear(Integer.parseInt(year)) ? "is" : "is not");
    }

    public static void main(String[] args) {
        judge();
    }
}

