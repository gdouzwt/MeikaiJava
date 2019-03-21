package io.zwt.chap06.exe;

import java.util.Scanner;

public class Exe13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();   //假定两个数组中的元素个数相同
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = n - 1; i >= 0; i--)
            b[n - 1 - i] = a[i];       //倒序复制

        System.out.println("已经将a中的全部元素倒序复制到了b中。");

        for (int i = 0; i < n; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
