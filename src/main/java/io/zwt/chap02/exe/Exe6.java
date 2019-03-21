package io.zwt.chap02.exe;

import java.util.Scanner;

public class Exe6 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("求三角形的面积。");

        System.out.print("底：");
        double bottom = stdIn.nextDouble();

        System.out.print("高：");
        double height = stdIn.nextDouble();

        System.out.print("面积是" + (bottom * height / 2));

    }
}
