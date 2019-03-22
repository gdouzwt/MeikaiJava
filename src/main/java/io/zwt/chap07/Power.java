package io.zwt.chap07;

import java.util.Scanner;

public class Power {

    //--- 返回x的n次幂---//
    static double power(double x, int n) {
        double tmp = 1.0;

        for (int i = 0; i <= n; i++) {
            tmp *= x; // 将tmp乘以x
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);



    }
}
