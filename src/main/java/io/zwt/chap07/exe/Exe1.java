package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe1 {

    static int signOf(int n) {
        if (n > 0)
            return 1;
        else if (n == 0) return 0;
        else return -1;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数，判断其符号：");
        int n = stdIn.nextInt();
        switch (signOf(n)) {
            case 1:
                System.out.println(n + "是正数!"); break;
            case -1:
                System.out.println(n + "是负数!"); break;
            default:
                System.out.println(n + "是零!");
        }
    }
}
