package io.zwt.chap02;

import java.util.Scanner;

public class HelloNextLine {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("您的名字是：");
        String s = stdIn.nextLine();

        System.out.println("你好" + s + "先生。");
    }
}
