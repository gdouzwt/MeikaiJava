package io.zwt.chap03;

import java.util.Scanner;

public class DigitsNo1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();

        if (n == 0)
            System.out.println("是0。");
        else if (n > -9 && n <= 9)
            System.out.println("是1位数值。");
        else
            System.out.println("是2位以上的数值。");
    }
}
