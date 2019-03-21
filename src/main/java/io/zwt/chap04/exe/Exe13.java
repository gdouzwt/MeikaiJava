package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算1到n的和：");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1到" + n + "的和是" + sum + "。");
    }
}
