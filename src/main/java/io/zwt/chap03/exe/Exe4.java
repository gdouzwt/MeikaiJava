package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a的值为：");
        int a = stdIn.nextInt();
        System.out.println("b的值为：");
        int b = stdIn.nextInt();

        if (a > b)
            System.out.println("a更大");
        else if (b > a)
            System.out.println("b更大");
        else
            System.out.println("a和b相等");
    }
}
