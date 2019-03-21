package io.zwt.chap03;

import java.util.Scanner;

public class PositiveNot {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();
        if (n > 0)
            System.out.print("该值为正。");
        else
            System.out.print("该值为负。");
    }
}
