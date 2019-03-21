package io.zwt.chap02;

import java.util.Random;

public class LuckyNo {

    public static void main(String[] args) {
        Random rand = new Random();

        int lucky = rand.nextInt(10);

        System.out.println("今天的幸运数字是" + lucky + "。");
    }
}
