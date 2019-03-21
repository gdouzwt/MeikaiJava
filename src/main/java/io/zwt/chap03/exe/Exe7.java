package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe7 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数值：");
        int n = stdIn.nextInt();
        int c = n % 3;

        if (n < 0)
            System.out.println("输入不是正值");
        else if (n % 3 == 0)
            System.out.println("该值可以被3整除");
        else
            System.out.println("该值除以3余" + c + "。");
    }
}
