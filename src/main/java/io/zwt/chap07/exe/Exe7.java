package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe7 {

    private static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
        System.out.println();
    }

    private static void putStars(int n) {
        putChars('*', n);
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("输入层数：");
        int n = stdIn.nextInt();
        do {
            putStars(n);
        }
        while (n-- > 0);
    }
}
