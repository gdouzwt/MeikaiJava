package io.zwt.chap05.exe;

import java.util.Scanner;

/**
 * 请编写一段程序，显示float型的变量和double型的变量中读入的值。
 */
public class Exe2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("变量x为float型，变量y为double型。");
        System.out.print("x : ");
        float x = stdIn.nextFloat();
        System.out.print("y : ");
        double y = stdIn.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
