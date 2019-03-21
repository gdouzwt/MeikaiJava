//对读入的整数进行加法运算（不对负值进行加法运算）
package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("对整数进行加法运算。");
        System.out.print("要相加多少个整数：");
        int n = stdIn.nextInt();//要相加的个数
        int ave = 0;
        int sum = 0;//合计值
        for (int i = 0; i < n; i++) {
            System.out.print("整数：");
            int t = stdIn.nextInt();
            sum += t;
            if (n > 0) {
                ave = sum / n;
            }
        }
        System.out.println("合计值为" + sum + "。");
        System.out.println("平均值为" + ave + "。");
    }
}
