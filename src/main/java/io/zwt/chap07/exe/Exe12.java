package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe12 {

    //--- 显示int型的位构成 ---//
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1 ? '1' : '0'));
        }
    }

    //--- 这里的算法直接参考java.lang.Integer.rotateLeft的实现 ---//
    //--- 而JDK的源码这个算法是参考了Hacker's Delight书中实现 ---//
    static int rRotate(int x, int n) {
        return (x >>> n) | (x << -n);
    }

    //--- TODO:找个时间研究一下具体的原理 ---//
    static int lRotate(int x, int n) {
        return (x << n) | (x >>> -n);
    }


    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int x = stdIn.nextInt();
        System.out.print("请输入移位数：");
        int n = stdIn.nextInt();


        //打印出初始输入的数字二进制补码形式
        printBits(x);
        System.out.println();

        //将x向左旋转n位之后再打印出来
        printBits(lRotate(x, n));
        System.out.println();

        //将x向右旋转n位之后再打印出来
        printBits(rRotate(x, n));

    }
}
