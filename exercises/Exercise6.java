package com.jordanamcr.exercises;

public class Exercise6 {

    public static void main(String[] args) {
        boolean sum = true;
        System.out.println(calculate(2, 6, sum));
        sum = false;
        System.out.println(calculate(3, 5, sum));
    }

    private static int calculate(int a, int b, boolean cond) {
        if (cond) {
            a += b;
            return a;
        } else {
            a = a * b;
            return a;
        }
    }
}
