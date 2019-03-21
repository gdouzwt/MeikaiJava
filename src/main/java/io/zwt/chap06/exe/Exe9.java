package io.zwt.chap06.exe;

import java.util.Random;
import java.util.Scanner;

class Exe9 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = 1 + rand.nextInt(10); //大于等于1小于等于10

        //输出测试用
        for (int i : a)
            System.out.println(i);

    }
}
