package io.zwt.chap05.exe;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int n = stdIn.nextInt();

        System.out.printf("用八进制数表示为%o。\n用十六进制数表示为%x。", n, n);
    }
}
