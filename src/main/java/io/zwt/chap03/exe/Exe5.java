package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();

        if (n < 0)
            System.out.println("输入不是正值");
        else if (n % 5 == 0)
            System.out.println("该值可以被5整除");
        else
            System.out.println("该值不可以被5整除");
    }
}
