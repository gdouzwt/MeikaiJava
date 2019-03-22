package io.zwt.chap07;

import java.util.Scanner;

public class Power2 {

    static double power(double x, int n) {
        double tmp = 1.0;

        while (n-- > 0)
            tmp *= x;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算a的b次幂。");
        System.out.print("实数a：");  double a = stdIn.nextDouble();
        System.out.print("整数b：");  int b = stdIn.nextInt();

        System.out.println(a + "的" + b + "次幂为" + power(a, b) + "。");
    }
}
