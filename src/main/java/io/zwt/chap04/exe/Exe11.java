package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("倒数:");
        int n = stdIn.nextInt();

        for (int i = 0; i <= n; ) {
            System.out.println(n);
            n--;
        }
    }
}
