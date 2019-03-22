package io.zwt.chap07;

import java.util.Scanner;

public class SquareRectangle {

    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    static void putSquare(int n) {
        for (int i = 1; i <= n; i++) {
            putChars('+', n);
            System.out.println();
        }
    }

    static void putRectangle(int h, int w) {
        for (int i = 1; i <= h; i++) {
            putChars('*', w);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("显示正方形。");
        System.out.print("边长："); int n = stdIn.nextInt();
        putSquare(n);

        System.out.println("显示长方形");
        System.out.print("宽："); int h = stdIn.nextInt();
        System.out.print("长："); int w = stdIn.nextInt();
        putRectangle(h, w);
    }
}
