package com.company; //без этой строчки программа выдаёт ошибку

import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //если этот метод не добавить, то тоже ошибка
        calculate(1, 2, 4, 5);
        System.out.println("Результат " + calculate(1, 2, 4, 5));
        between10and20(1, 14);
        System.out.println("Результат " + between10and20(1, 14));
        positiveOrNegative(5);
        System.out.println("Результат " + positiveOrNegative(5));
        isNegative(-5);
        System.out.println("Результат " + isNegative(-5));
        Hello("Pavel");
        System.out.println("Pavel");
        isLeapYearBool(1938);
        System.out.println("Результат " + isLeapYearBool(1938));



        byte q = 120;
        short w = 12521;
        int e = 1254;
        long r = 1258458;
        float t = 1254856998f;
        double y = 125558.125;
        boolean u = true;
        String name = "Pavel";
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d)); //простое вычисление
    }

    private static boolean between10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20; // если сумма х и у между 10 и 20 включительно, то всё работает
    }

    private static boolean positiveOrNegative(int num) {
        return num >= 0; //передача целого числа. Метод напишет положительное оно или отрицательное
    }

    private static boolean isNegative(int number) {
        return number < 0; // тру если положительное число и фолс если отрицательное
    }

    private static String Hello(String name) {
        return "Привет, " + name; // привет+указанное имя
    }

    private static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0; //задание про високосный год. Метод отпределяет является ли указанный год високосным.
    }
// задания второго урока

    private static int[] mass1(int[] array) {
        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array; //перепробовал все способы вызова метода - ничего не получается=( Что не так?
    }

    private static int[] arrEight(int[] array, int step, int shift) {
        for (int i = 0; i < 8; i++) {
            array[1] = shift + i * step;
        }
        return array; //  метод вызывается с ошибкой. Что я делаю не так7
    }

    private static void umnojenieMensheShesti(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            return; //у меня явные проблемы с вызовом методов
        }
    }

    public static void kvadratArr(int size) {
        int[][] kvadratArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                kvadratArr[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", kvadratArr[i][j]);
            }
        }
        //все методы работают, но как вызвать массивы я не знаю( подскажите пжлст
    }
}
