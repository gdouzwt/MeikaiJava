package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print('*');
            System.out.println();

        }
    }
}
