package io.zwt.chap06.exe;

import java.util.Random;

class Exe1 {

    public static void main(String[] args) {

        Random rand = new Random();
        double[] a = new double[5];
        for (int i = 0; i < 5; i++) {
            a[i] = rand.nextDouble() * 10;
            System.out.println(a[i]);
        }

    }
}
