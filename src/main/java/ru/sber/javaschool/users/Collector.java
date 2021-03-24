package ru.sber.javaschool.users;

import ru.sber.javaschool.User;

/*Инкассатор банкомата*/
public class Collector extends User {
    public Collector(String cardnumber, int pinCode) {
        super(cardnumber, pinCode);
    }
}
