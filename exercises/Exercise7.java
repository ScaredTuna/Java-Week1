package com.jordanamcr.exercises;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(add(0, 6, false));
        System.out.println(add(3, 0, false));
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
