package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a："); int a = stdIn.nextInt();

        System.out.print("整数b："); int b = stdIn.nextInt();

        System.out.print("整数c："); int c = stdIn.nextInt();

        int m, n, k;
//        m = (a > b ? b : a);
        if (a > b)//m是a和b中较小数
            m = b;
        else
            m = a;
        if (m > c)//k是3个数的中间数
            k = m;
        else {
            n = (a > b ? a : b);//n是a和b的较大数
            if (n > c)
                k = c;
            else
                k = n;
        }
        System.out.println(a + "、" + b + "、" + c + "的中间值是" + k);
    }
}




