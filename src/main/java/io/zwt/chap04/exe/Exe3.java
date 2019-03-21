package io.zwt.chap04.exe;

import java.util.Random;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数A:");
        int a = stdIn.nextInt();
        System.out.println("整数B:");
        int b = stdIn.nextInt();

        int min = a < b ? a : b;
        int n = a < b ? (b - a) : (a - b);
        for (int i = 0; i < (n + 1); i++)
            System.out.println(min + i);


    }
}
