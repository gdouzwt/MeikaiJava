package io.zwt.chap06.exe;

class Exe2 {

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = a.length; i > 0; i--) {
            a[i - 1] = i;
            System.out.println(a[i - 1]);
        }
    }
}
