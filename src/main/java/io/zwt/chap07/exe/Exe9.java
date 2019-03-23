package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe9 {

    static Scanner stdIn = new Scanner(System.in);

    private static int readPlusInt() {
        int value;
        do {
            System.out.print("正整数值：");
            value = stdIn.nextInt();
        } while (value <= 0);
        return value;
    }

    public static void main(String[] args) {

        readPlusInt();
    }
}
