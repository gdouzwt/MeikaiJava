package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int n = stdIn.nextInt();
        int m = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                j++;
                m = j;
            }
        }
        System.out.println("约数有" + m + "个");
    }
}
