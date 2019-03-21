package io.zwt.chap04;

import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int hand;
        do {
            System.out.print("请选择手势（0~石头/1~剪刀/2~布）:");
            hand = stdIn.nextInt();
        } while (hand < 0 || hand > 2);
        switch (hand) {
            case 0:
                System.out.println("石头");
                break;
            case 1:
                System.out.println("剪刀");
                break;
            case 2:
                System.out.println("布");
                break;
        }
    }
}
