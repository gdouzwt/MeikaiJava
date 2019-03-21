package io.zwt.chap06.exe;

import java.util.Scanner;

class Exe6 {

    public static void main(String[] args) {

        int sum = 0;
        int high;
        int low;
        Scanner stdIn = new Scanner(System.in);  //读入键盘输入
        System.out.print("请输入学生人数：");  //提示输入学生人数
        int n = stdIn.nextInt();  //从键盘读入学生人数
        int[] a = new int[n];  //存放每名学生分数的数组
        System.out.println("请输入" + n + "名学生的分数。");  //提示输入每名学生的分数
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "号的分数：");
            a[i] = stdIn.nextInt();
            sum += a[i];
        }

        double ave = (double) sum / n;

        high = low = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > high) high = a[i];
            if (a[i] < low) low = a[i];
        }

        System.out.println("总分：" + sum);
        System.out.println("平均分：" + ave);
        System.out.println("最高分：" + high);
        System.out.println("最低分：" + low);

    }
}
