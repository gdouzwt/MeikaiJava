package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print('*');
    }
}
