package ru.sber.javaschool;

import ru.sber.javaschool.atmfunction.GetBalance;

public class ATM {

    public static void main(String[] args) {
        /*Запрос Баланса*/
        System.out.println("Баланс составляет: " + GetBalance.getBalance() + " CUR");
    }
}
