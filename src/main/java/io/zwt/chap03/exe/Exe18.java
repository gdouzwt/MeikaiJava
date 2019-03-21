package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("月份:");
        int n = stdIn.nextInt();

        switch (n) {
            case 1:
            case 2:
            case 3:
                System.out.print(n + "月是春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.print(n + "月是夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.print(n + "月是秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.print(n + "月是冬天");
                break;

        }
    }
}

