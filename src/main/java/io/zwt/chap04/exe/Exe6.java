package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print('*');
            i++;
        }
    }
}
