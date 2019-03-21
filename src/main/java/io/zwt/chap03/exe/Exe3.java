package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("该值为正。");
        else if (n < 0)
            System.out.println("该值为负。");
        else if (n == 0)
            System.out.println("该值为0。");
    }
}
