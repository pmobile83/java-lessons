package ru.sber.javaschool.users;

import ru.sber.javaschool.User;

/*Пользователь является клиентом стороннего Банка*/
public class ForeignClient extends User {
    public ForeignClient(String cardnumber, int pinCode) {
        super(cardnumber, pinCode);
    }
}
