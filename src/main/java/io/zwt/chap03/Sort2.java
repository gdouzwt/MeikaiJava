package io.zwt.chap03;

import java.util.Scanner;

public class Sort2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("变量a：");
        int a = stdIn.nextInt();

        System.out.print("变量b：");
        int b = stdIn.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("排序成a<=b。");
        System.out.println("变量a是" + a + "。");
        System.out.println("变量b是" + b + "。");
    }
}
