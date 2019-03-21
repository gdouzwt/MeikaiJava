package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("输入成绩：");
        int n = stdIn.nextInt();

        if (n <= 59)
            System.out.println("不及格。");
        else if (n < 70)
            System.out.println("及格。");
        else if (n < 80)
            System.out.println("良。");
        else System.out.println("优。");
    }
}
