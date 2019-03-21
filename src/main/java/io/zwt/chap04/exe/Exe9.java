package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算1到n的积。");
        int n;
        do {
            System.out.print("n的值：");
            n = stdIn.nextInt();
        } while (n <= 0);
        int product = 1;
        int i = 1;

        while (i <= n) {
            product *= i;
            i++;
        }
        System.out.println("1到" + n + "的积是" + product + "。");
    }
}
