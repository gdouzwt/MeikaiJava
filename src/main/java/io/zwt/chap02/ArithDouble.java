package io.zwt.chap02;

import java.util.Scanner;

public class ArithDouble {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("对x和y进行加减乘除运算。");

        System.out.print("x的值");
        double x = stdIn.nextDouble();

        System.out.print("y的值");
        double y = stdIn.nextDouble();

        printArith(x, y);

    }

    static void printArith(double x, double y) {
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}
