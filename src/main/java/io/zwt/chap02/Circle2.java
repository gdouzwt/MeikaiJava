package io.zwt.chap02;

import java.util.Scanner;

public class Circle2 {

    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径：");
        double r = stdIn.nextDouble();  //半径

        System.out.println("周长是" + 2 * PI * r + "。");
        System.out.println("面积是" + PI * r * r + "。");
    }
}
