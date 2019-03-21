package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;
        int i = 0;
        do {

            System.out.println("整数值：");
            x = stdIn.nextInt();
        } while (x <= 0);
        while (x > 0) {
            x /= 10;
            i++;
        }
        System.out.println("这是" + i + "位数。");
    }
}
