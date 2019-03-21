package io.zwt.chap02.exe;

import java.util.Random;

public class Exe9 {

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(-1.0 + rand.nextDouble() * 2);
//            System.out.println(rand.nextDouble());
//            System.out.println(rand.nextDouble() * 10);
        }
    }
}
