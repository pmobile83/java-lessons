package ru.sber.javaschool;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        ArithmeticOperations ao = new ArithmeticOperations();

        ao.inputValues();                             /*      Ввод 2-х чисел                */
        ao.addition(value1, value2);                  /*      Сложение                      */
        ao.subtraction(value1, value2);               /*      Вычитание                     */
        ao.multiplication(value1, value2);            /*      Умножение                     */
        ao.division(value1, value2);                  /*      Деление                       */
        ao.power(value1, value2);                     /*      Возведение в степень          */
        ao.compare(value1, value2);                   /*      Сравнение                     */
        ao.greatestCommonFactor(value1, value2);      /*      Наибольший общий делитель     */
    }

    static int value1;
    static int value2;

    void inputValues() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        value1 = in.nextInt();
        do {
            System.out.print("Введите второе число отличное от 0: ");
            while (!in.hasNextInt()) {

                in.next();
            }
            value2 = in.nextInt();
        } while (value2 == 0);
        System.out.println();
    }

    public int addition(int value1, int value2) {
        int res = value1 + value2;
        System.out.println("Сумма чисел: " + res);
        return res;
    }

    public int subtraction(int value1, int value2) {
        int res = value1 - value2;
        System.out.println("Разница чисел: " + res);
        return res;
    }

    public int multiplication(int value1, int value2) {
        int res = value1 * value2;
        System.out.println("Произведение чисел: " + res);
        return res;
    }

    public double division(double value1, double value2) {
        double res = value1 / value2;
        System.out.println("Частное чисел: " + res);
        return res;
    }

    public long power(int value1, int value2) {
        long res = 1;
        for (int i = 1; i <= value2; i++) {
            res = res * value1;
        }
        System.out.println(value1 + " в степени " + value2 + ": " + res);
        return res;
    }

    public String compare(int value1, int value2) {
        String rez;
        int res = value1 - value2;
        if (value1 == value2) {
            System.out.println("Введенные числа равны");
            rez = "Введенные числа равны";
        } else {
            rez = (value1 > value2) ? "Первое число больше второго на: " + res : "Второе число больше первого на: " + -res;
            System.out.println(rez);
        }
        return rez;
    }

    public int greatestCommonFactor(int value1, int value2) {
        int res = 1;
        int remainderV1, remainderV2;

        for (int i = 1; i <= Math.min(value1, value2); i++) {
            remainderV1 = value1 % i;
            remainderV2 = value2 % i;
            if (remainderV1 == 0 && remainderV2 == 0) {
                res = i;
            }
        }
        System.out.println("Наибольший общий делитель: " + res);
        return res;
    }
}
