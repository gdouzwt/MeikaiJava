package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n的值：");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print((i < n) ? (i + "+") : i + "=" + sum);
        }

    }
}
