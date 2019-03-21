package io.zwt.chap03;

import java.util.Scanner;

public class DigitsNo2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)
            System.out.println("是2位以上的数值。");
        else
            System.out.println("是不足2位的数值。");
    }
}
