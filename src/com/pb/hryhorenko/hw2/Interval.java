package com.pb.hryhorenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите число из диапазона от 0 до 100");
        x = scan.nextInt();
        if (x >= 0 && x <= 100) {
            if (x <= 14) {
                System.out.println("Диапазон [0-14]");
            } else if (x<=35) {
                System.out.println("Диапазон [15-35]");
            } else if (x<=50) {
                System.out.println("Диапазон [36-51]");
            } else {
                System.out.println("Диапазон [51-100]");
            }
        }
    }
}


