package io.zwt.chap07.exe;

import java.util.Random;
import java.util.Scanner;

/**
 * Extension to MentalArithmetic
 */
public class Exe10 {
    private static Scanner stdIn = new Scanner(System.in);

    private static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("再来一次？ <Yes~1/No~0>: ");
            cont = stdIn.nextInt();
        } while (cont != 0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args) {


        Random rand = new Random();

        System.out.println("心算能力训练！！");
        do {
            int x = rand.nextInt(900) + 100;  // 3位数
            int y = rand.nextInt(900) + 100;  // 3位数
            int z = rand.nextInt(900) + 100;  // 3位数
            int c = rand.nextInt(4);

            switch (c) {
                case 0:
                    case0IsCorrect(x, y, z); break;
                case 1:
                    case1IsCorrect(x, y, z); break;
                case 2:
                    case2IsCorrect(x, y, z); break;
                case 3:
                    case3IsCorrect(x, y, z); break;
                default:
                    break;
            }

        } while (confirmRetry());
    }

    private static void case0IsCorrect(int x, int y, int z) {
        while (true) {
            System.out.print(x + " + " + y + " + " + z + " = ");
            int k = stdIn.nextInt();
            if (k == x + y + z)
                break;
            System.out.println("回答错误！!！");
        }
    }

    private static void case1IsCorrect(int x, int y, int z) {
        while (true) {
            System.out.print(x + " + " + y + " - " + z + " = ");
            int k = stdIn.nextInt();
            if (k == x + y - z)
                break;
            System.out.println("回答错误！!！");
        }
    }

    private static void case2IsCorrect(int x, int y, int z) {
        while (true) {
            System.out.print(x + " - " + y + " + " + z + " = ");
            int k = stdIn.nextInt();
            if (k == x - y + z)
                break;
            System.out.println("回答错误！!！");
        }
    }

    private static void case3IsCorrect(int x, int y, int z) {
        while (true) {
            System.out.print(x + " - " + y + " - " + z + " = ");
            int k = stdIn.nextInt();
            if (k == x - y - z)
                break;
            System.out.println("回答错误！!！");
        }
    }
}
