package io.zwt.chap06;

import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = 0; i < n; i++)
            b[i] = a[i];

        System.out.println("已经将a中的全部元素复制到了b中。");

        for (int i = 0; i < n; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
