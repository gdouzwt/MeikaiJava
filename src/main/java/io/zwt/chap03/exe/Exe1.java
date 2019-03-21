package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");

        int n = stdIn.nextInt();

        if (n >= 0)
            System.out.println("其绝对值是" + n);
        else
            System.out.println("其绝对值是" + -n);
    }
}

