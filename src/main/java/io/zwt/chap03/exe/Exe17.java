package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数:");
        int n = stdIn.nextInt();

        switch (n) {
            case 0:
                System.out.print("石头");
                break;
            case 1:
                System.out.print("剪刀");
                break;
            case 2:
                System.out.print("布");
                break;
        }
    }
}

