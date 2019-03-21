package io.zwt.chap04;

import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算1到n的和。");
        int n;
        do {
            System.out.print("n的值：");
            n = stdIn.nextInt();
        } while (n <= 0);
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1到" + n + "的和是" + sum + "。");
    }
}
