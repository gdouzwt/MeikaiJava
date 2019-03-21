package io.zwt.chap03.exe;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();
        System.out.print("整数c：");
        int c = stdIn.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;


        int middle = a;
        if (middle == min || middle == max)
            middle = b;
        if (middle == min || middle == max)
            middle = c;

        System.out.println("三个整数从小到大升序排列如下：");
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }

}
