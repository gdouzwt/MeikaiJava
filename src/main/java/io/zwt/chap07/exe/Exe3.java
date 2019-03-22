package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe3 {

    private static int med(int[] a) {

        //naive sorting
        int temp;
        if (a[0] > a[1]) {
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        if (a[1] > a[2]) {
            temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }

        return a[1];
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[] a = new int[3];

        System.out.print("整数a：");
        a[0] = stdIn.nextInt();
        System.out.print("整数b：");
        a[1] = stdIn.nextInt();
        System.out.print("整数c：");
        a[2] = stdIn.nextInt();

        System.out.println("中间值是" + med(a) + "。");
    }
}
