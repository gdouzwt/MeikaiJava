package io.zwt.chap06.exe;

class Exe3 {

    public static void main(String[] args) {
        double[] a = new double[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (double) (11 + (i * 11)) / 10;
            System.out.println(a[i]);
        }
    }
}
