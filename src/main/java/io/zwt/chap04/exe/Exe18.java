package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n的值：");
        int n = stdIn.nextInt();


        for (int i = 1; i <= n; i++) {
            int m = i * i;
            System.out.println(i + "的平方是" + m);
        }

    }
}
