package io.zwt.chap02.exe;

import java.util.Random;
import java.util.Scanner;

public class Exe7 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");
        int x = stdIn.nextInt();
        System.out.println("生成了该值±5范围内的随机数，是" + (x + (-5 + rand.nextInt(11))));
    }
}
