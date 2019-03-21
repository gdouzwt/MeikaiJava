package io.zwt.chap06.exe;

import java.util.Scanner;

class Exe8 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner stdIn = new Scanner(System.in);  //读入键盘输入
        System.out.print("请输入元素个数：");  //提示输入元素个数
        int n = stdIn.nextInt();  //从键盘读入元素个数
        double[] a = new double[n];  //存放元素的double数组
        System.out.println("请输入" + n + "个元素的值。");  //提示输入每名学生的分数
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "号元素的值：");
            a[i] = stdIn.nextDouble();
        }

        for (double i : a)  // 有必要么？ 直接放在上面也可以啊
            sum += i;
        double ave = (double) sum / n;

        System.out.println("合计值：" + sum);
        System.out.println("平均值：" + ave);


    }
}
