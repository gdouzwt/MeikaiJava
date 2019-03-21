package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;//要重复一次吗？

        do {
            System.out.print("判断读入的整数值的符号。\n请输入整数：");
            int num = stdIn.nextInt();

            if (num > 0)
                System.out.println("这是正数");
            else if (num < 0)
                System.out.println("这是负数");
            else
                System.out.println("这是0");

            System.out.print("要重复一次吗？ 1~Yes/0~No:");
            retry = stdIn.nextInt();
        }
        while (retry == 1);
    }
}
