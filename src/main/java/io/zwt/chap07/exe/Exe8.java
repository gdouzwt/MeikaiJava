package io.zwt.chap07.exe;

import java.util.Random;
import java.util.Scanner;

public class Exe8 {

    private static int random(int a, int b) {
        if (b < a) return a;
        Random random = new Random();
        return random.nextInt(b - a) + a;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入整数a：");
        int a = stdIn.nextInt();
        System.out.print("请输入整数b：");
        int b = stdIn.nextInt();

        //int n = 10;
        //while (n-- > 0)
        System.out.println(random(a, b));


    }
}
