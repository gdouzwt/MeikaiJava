package io.zwt.chap04.exe;

import java.util.Random;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = 10 + rand.nextInt(90);//目标数字：生成一个10~99的随机数

        System.out.println("猜数字游戏开始！！");
        System.out.println("请猜一个10~99的数字。");

        int x;
        do {
            System.out.print("是多少呢：");
            x = stdIn.nextInt();
            if (x > no)
                System.out.println("比这个数字小哟。");
            else if (x < no)
                System.out.println("比这个数字大哟。");
        } while (x != no);

        System.out.println("回答正确。");
    }
}
