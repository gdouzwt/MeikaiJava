package io.zwt.chap04.exe;

import java.util.Scanner;

/**
 * P115 练习4-24 朴素实现方法，效率较低，有空可以添加改进的版本
 */
public class Exe24 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("请输入正整数：");
            n = stdIn.nextInt();
        } while (n <= 0);

        //判断是否为质数
        //是否可以被2<=x<n整除
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + "不是质数。");
                return;
            }
        }
        System.out.println(n + "是质数");
    }
}
