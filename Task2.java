package org.example;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До обмена: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }
}
