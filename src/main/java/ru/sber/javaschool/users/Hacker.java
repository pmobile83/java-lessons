package ru.sber.javaschool.users;

import ru.sber.javaschool.User;

/*Мошенник, пытающийся взломать банкомат*/
public class Hacker extends User {
    public Hacker(String cardnumber, int pinCode) {
        super(cardnumber, pinCode);
    }
}
