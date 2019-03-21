package io.zwt.chap06.exe;

import java.util.Random;
import java.util.Scanner;

public class Exe4 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);
        // 输出12行
        // * * * *
        // --------- ...
        // 0 1 2 3   ...
        for (int i = 0; i <= 12; i++) {
            if (i <= 10) {
                for (int j = 0; j < n; j++)
                    System.out.print((i > (10 - a[j])) ? "* " : "  ");  // 大于10-a[j]才显示*
                System.out.println(); //注意换行
            } else if (i == 11) {  // 第11行是----------------------------
                for (int k = 0; k <= 2 * n - 2; k++)
                    System.out.print("-");
                System.out.println();
            } else {  //剩下最后一行是下标索引除以10的余数
                for (int x = 0, l = 1; l <= 2 * n - 1; l++) {

                    if (l % 2 == 0) {
                        System.out.print(" "); //空格对齐
                    } else {
                        System.out.print(x % 10);
                        x++;
                    }
                }
            }
        }
    }
}
