package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("对整数进行加法运算。");
        System.out.print("要相加多少个整数：");
        int n = stdIn.nextInt();
        int ave = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("整数（以0结束）：");
            int t = stdIn.nextInt();
            if (t == 0) break;//跳出for语句
            sum += t;
            ave = sum / n;
        }

        System.out.println("合计值为" + sum + "。");
        System.out.println("平均值为" + ave + "。");
    }
}
