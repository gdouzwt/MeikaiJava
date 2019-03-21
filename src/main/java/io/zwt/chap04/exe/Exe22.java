package io.zwt.chap04.exe;

import java.util.Scanner;

/**
 * @Author 招文桃
 * @Date 2019年1月28日
 * @Time 06:40
 * <p>
 * 第4章第4节 113页
 * 练习 4-22
 * 请编写一段程序，显示 n层的金字塔（图中是4层的示例）。
 * 第 i行显示（i - 1) * 2 + 1 个 '*',最后一行即第n行显示（n-1）*2+1个'*'
 * *
 * ***
 * *****
 * *******
 */

public class Exe22 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入金字塔层数：");
        int n = stdIn.nextInt();

        //确定每行要输出多少空格即可，反正题目都给出每行要输出多少'*'的计算方法了
        //接下来就是：输出空格' ' -> 输出'*' -> 输出空格' ' 啦

        for (int i = 1; i <= n; i++) {

            drawChar(n - i, ' ');

            drawChar((i - 1) * 2, '*');

//            drawChar(n - i, ' ');

            System.out.println();
        }
    }

    private static void drawChar(int v, char c) {
        for (int j = 1; j <= v + 1; j++) {
            System.out.print(c);
        }
    }
}

