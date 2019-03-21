package io.zwt.chap06.exe;

import java.util.Scanner;

class Exe5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }
        System.out.print("a = {");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i == n - 1) break;
            System.out.print(", ");
        }
        System.out.print("}");

    }
}
