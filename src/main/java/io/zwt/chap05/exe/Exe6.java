package io.zwt.chap05.exe;

public class Exe6 {
    public static void main(String[] args) {
        float a = 0.0F;
        float b;
        int i = 0;

        System.out.println("  float        int   ");
        System.out.println("---------------------");

        while (i <= 1000) {
            b = (float) i / 1000;
            System.out.printf("%1.7f   %1.7f\n", a, b);
            a += 0.001F;
            i++;
        }
    }
}
