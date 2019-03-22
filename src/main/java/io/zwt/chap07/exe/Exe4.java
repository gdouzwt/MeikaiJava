package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe4 {

    static int sumUp(int n) {
        int tmp = n;
//        for (int i = 1; i <= n; i++)
//            tmp += i;
//        return tmp;

        while (n-- > 0)
            tmp += n;
        return tmp;

    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入整数n：");
        int n = stdIn.nextInt();
        System.out.println("1到n的所有整数的和为：" + sumUp(n));
    }
}
