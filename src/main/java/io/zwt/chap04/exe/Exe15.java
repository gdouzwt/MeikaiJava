package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.print("从多少cm开始：");
        int a = stdIn.nextInt();
        System.out.print("从多少cm结束：");
        int b = stdIn.nextInt();
        System.out.print("每次增量多少cm：");
        int c = stdIn.nextInt();
        int h = a;//身高
        double w;//标准体重
        System.out.println("身高   标准体重");

        for (int i = 0; i < ((b - a) / c); i++) {
            h = h + c;
            w = (h - 100) * 0.9;
            System.out.println(h + "    " + w);
        }

    }
}
