package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe7 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个呢：");
        int n = stdIn.nextInt();

/***********改进版，确保从*开始************/
        int i = 1;

        while (i <= n) {
            System.out.print((i % 2 == 0) ? "+" : "*");
            i++;
        }

/***最初版，虽然也是交叉，但是输入奇数（+开头）和偶数（*开头）开始的字符不同***/
//        while (n > 0) {
//            System.out.print((n % 2 == 0) ? "*" : "+");
//            n--;
//        }
/*** 对调后，输入15符合题目示意 ***/
//        while (n > 0) {
//            System.out.print((n % 2 == 0) ? "+" : "*");
//            n--;
//        }
        System.out.println();
    }
}
