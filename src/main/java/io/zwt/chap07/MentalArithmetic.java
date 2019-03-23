package io.zwt.chap07;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {

    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("再来一次？<Yes~1/No~0>: ");
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
            while (true) {
                System.out.print(x + " + " + y + " + " + z + " = ");
                int k = stdIn.nextInt();
                if (k == x + y + z)
                    break;
                System.out.println("回答错误！！");
            }
        } while (confirmRetry());
    }
}
