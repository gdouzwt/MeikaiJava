package io.zwt.chap02.exe;

import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("姓：");
        lastName = stdIn.nextLine();

        System.out.print("名：");
        firstName = stdIn.nextLine();

        System.out.println("你好" + lastName + firstName + "。");
    }
}
