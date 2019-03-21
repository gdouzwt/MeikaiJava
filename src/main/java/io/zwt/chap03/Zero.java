package io.zwt.chap03;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();

        if (!(n != 0))
            System.out.println("该值是0");
        else
            System.out.println("该值不是0");
    }
}
