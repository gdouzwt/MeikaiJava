package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe11 {
    static int powersOfTwo(int n) {
        int tmp = 1;
        while (n-- > 0)
            tmp *= 2;
        return tmp;
    }

    static int leftShift(int i, int n) {
        return i << n;
    }

    static int rightShift(int i, int n) {
        return i >> n;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数： ");
        int i = stdIn.nextInt();
        System.out.print("请输入移位数： ");
        int n = stdIn.nextInt();

        System.out.println("左移" + n + "位后的值：" + leftShift(i, n));
        System.out.println("乘以2的" + n + "次幂的值：" + i * powersOfTwo(n));
        System.out.println("右移" + n + "位后的值：" + rightShift(i, n));
        System.out.println("除以2的" + n + "次幂的值：" + i / powersOfTwo(n));
    }
}
