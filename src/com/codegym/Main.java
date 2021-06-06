package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a =");
        a = scanner.nextDouble();
        System.out.println("nhập b =");
        b = scanner.nextDouble();
        System.out.println("nhập c =");
        c = scanner.nextDouble();
        if (a == 0) {
            if (b == c) {
                System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }

        } else {
            double answer = (c-b)/a;
            System.out.println("phương trình có 1 nghiệm x = " + answer);
        }

    }
}
