package io.zwt.chap07.exe;

import java.util.Scanner;

public class Exe6 {

    private static void printSeason(int m) {

        if (m >= 3 && m <= 5)
            System.out.println("这是春天。");
        else if (m >= 6 && m <= 8)
            System.out.println("这是夏天。");
        else if (m >= 9 && m <= 11)
            System.out.println("这是秋天。");
        else if (m == 12 || m == 1 || m == 2)
            System.out.println("这是冬天。");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入月份:");
        int m = stdIn.nextInt();
        printSeason(m);
    }
}
