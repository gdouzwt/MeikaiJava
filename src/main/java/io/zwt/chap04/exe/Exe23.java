package io.zwt.chap04.exe;

import java.util.Scanner;

/**
 * @Author 招文桃
 * @Date 2019年1月28日
 * @Time 06:40
 * <p>
 * 第4章第4节 113页
 * 练习 4-23
 */

public class Exe23 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入数字金字塔层数：");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {

            drawChar(n - i, " ");

            drawChar((i - 1) * 2, String.valueOf((i % 10)));

//            drawChar(n - i, " ");

            System.out.println();
        }
    }

    private static void drawChar(int v, String c) {
        for (int j = 1; j <= v + 1; j++) {
            System.out.print(c);
        }
    }
}

