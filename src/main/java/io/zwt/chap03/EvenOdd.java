package io.zwt.chap03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数值：");
        int n = stdIn.nextInt();
        if (n > 0)
            if (n % 2 == 0)
                System.out.println("该值为偶数。");
            else
                System.out.println("该值为奇数。");
        else
            System.out.println("输入的不是正值。");
    }
}
