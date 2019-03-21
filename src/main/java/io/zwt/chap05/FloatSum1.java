package io.zwt.chap05;

// 以0.01为单位从0.0递增至1.0，并显示合计值（用float控制循环）

public class FloatSum1 {
    public static void main(String[] args) {
        float sum = 0.0F;

        for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
            System.out.println("x = " + x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}
