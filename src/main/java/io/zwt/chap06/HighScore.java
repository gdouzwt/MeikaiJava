package io.zwt.chap06;

import java.util.Scanner;

public class HighScore {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println("请输入" + ninzu + "名学生的分数。");
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "号的分数：");
            tensu[i] = stdIn.nextInt();
        }

        int max = tensu[0];
        for (int i = 1; i < tensu.length; i++)
            if (tensu[i] > max) max = tensu[i];

        System.out.println("最高分为" + max + "分。");
    }
}
