package com.jordanamcr.exercises;

public class Exercise8 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(add(i, 3, true));
        }
    }

    private static int add(int a, int b, boolean cond) {
        if (a == 0){
            return b;
        } else if (b == 0){
            return a;
        } else {
            if (cond) {
                a += b;
                return a;
            } else {
                a = a * b;
                return a;
            }
        }
    }
}
