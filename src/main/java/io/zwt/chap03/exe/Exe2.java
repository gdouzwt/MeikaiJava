package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数A：");
        int a = stdIn.nextInt();

        System.out.print("整数B：");
        int b = stdIn.nextInt();


        if (isDivisor(a, b))
            System.out.println("B是A的约数。");
        else
            System.out.println("B不是A的约数。");
    }

    private static boolean isDivisor(int a, int b) {

        return a % b == 0;
    }
}
