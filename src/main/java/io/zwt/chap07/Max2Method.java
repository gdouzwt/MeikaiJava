package io.zwt.chap07;

import java.util.Scanner;

public class Max2Method {

    static int max2(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); int a = stdIn.nextInt();
        System.out.print("整数b："); int b = stdIn.nextInt();

        System.out.println("最大值是：" + max2(a, b) + "。");
    }
}
