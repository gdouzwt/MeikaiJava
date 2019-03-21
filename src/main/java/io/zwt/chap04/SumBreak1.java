package io.zwt.chap04;

import java.util.Scanner;

public class SumBreak1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("对整数进行加法运算。");
        System.out.print("要相加多少个整数：");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("整数（以0结束）：");
            int t = stdIn.nextInt();
            if (t == 0) break;//跳出for语句
            sum += t;
        }
        System.out.println("合计值为" + sum + "。");
    }
}
