package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();

        System.out.print("整数b：");
        int b = stdIn.nextInt();
        int m;

        if (a > b)//a与b相差的值
            m = a - b;
        else
            m = b - a;
        System.out.println("a与b相差的值是" + m + "。");

    }
}
