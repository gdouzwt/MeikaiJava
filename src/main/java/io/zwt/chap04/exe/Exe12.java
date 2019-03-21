package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("顺数:");
        int n = stdIn.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
