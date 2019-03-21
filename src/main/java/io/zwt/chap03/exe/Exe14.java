package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();

        int min = 0, max = 0;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        if (min == max) {
            System.out.println("两个值相等。");
        } else {
            System.out.println("较小的值是" + min + "。");
            System.out.println("较大的值是" + max + "。");
        }

    }
}
