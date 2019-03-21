package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print('*');
            if (i % 5 == 0)
                System.out.print("\n");
        }
    }
}
