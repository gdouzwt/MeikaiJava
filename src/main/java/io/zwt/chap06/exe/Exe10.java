package io.zwt.chap06.exe;

import java.util.Random;
import java.util.Scanner;

class Exe10 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

//        int[] a = {1, 2, 2, 2, 2, 2, 2, 34, 4, 5, 6}; // 测试用数据
        int t = 0;

//        如何改进，使得连续元素值不相等。例如，不要出现{1, 3, 5, 5, 3, 2}的情况？
        for (int i = 0; i < a.length; i++)
            a[i] = 1 + rand.nextInt(10); //大于等于1小于等于10


        //before
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();

        //Seems working, but why?
        for (int i = 0; i < a.length; i++)
            doSomething(a);


        //after
        for (int i : a)
            System.out.print(i + " ");

    }

    private static void doSomething(int[] a) {
        int n = a.length;
        int t;
        for (int i = 0; i < n; i++) {
            if (i < n - 2) {
                if (a[i] == a[i + 1]) {
                    t = a[i + 1];
                    a[i + 1] = a[i + 2];
                    a[i + 2] = t;
                }
            } else if (a[n - 1] == a[n - 2]) {
                t = a[n - 1];
                a[n - 1] = a[n - 3];
                a[n - 3] = t;
            }
        }
//        for (int i : a)
//            System.out.print(i + " ");
//        System.out.println();
    }
}
