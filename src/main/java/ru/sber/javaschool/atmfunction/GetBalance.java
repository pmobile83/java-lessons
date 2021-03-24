package ru.sber.javaschool.atmfunction;

import ru.sber.javaschool.verification.Verification;

/*Получаем баланс*/
public class GetBalance {

    public static double getBalance() {
        double balance = 0.0;
        if (Verification.isVerification())
            balance = balance + Math.random() * 10000;


        return balance;
    }
}

