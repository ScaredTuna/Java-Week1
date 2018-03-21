package com.jordanamcr.exercises;

public class Exercise9 {

    public static void main(String[] args) {
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++) {
            integers[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(add(integers[i], integers[9 - i], true));
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
