package io.zwt.chap02;

import java.util.Scanner;

public class Circle1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径：");
        double r = stdIn.nextDouble();  //半径

        System.out.println("周长是" + 2 * 3.14 * r + "。");
        System.out.println("面积是" + 3.14 * r * r + "。");
    }
}
