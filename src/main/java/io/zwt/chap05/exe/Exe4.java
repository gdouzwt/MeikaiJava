package io.zwt.chap05.exe;

import java.util.Scanner;

public class Exe4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("输入3个整数：");
        System.out.print("x：");
        int x = stdIn.nextInt();
        System.out.print("y：");
        int y = stdIn.nextInt();
        System.out.print("z：");
        int z = stdIn.nextInt();

        System.out.println("合值：" + (x + y + z) + "\n平均值：" + (x + y + z) / 3.0);
    }
}
