package io.zwt.chap05;

public class IntegralToFloat {

    public static void main(String[] args) {
        int a = 123456789;
        long b = 1234567890123456789L;

        System.out.println("          a = " + a);
        System.out.println("   (float)a = " + (float) a);

        System.out.println("          b = " + (float) b);
        System.out.println("  (double)b = " + (double) b);
    }
}
