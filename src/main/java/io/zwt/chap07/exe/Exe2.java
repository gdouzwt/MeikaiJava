package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe2 {

    private static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("输入3个整数求最小值");
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
           System.out.print("n[" + i + "] = ");
           n[i] = stdIn.nextInt();
        }
        System.out.println("最小值为：" + min(n[0],n[1],n[2]));
    }
}
