package ru.sber.javaschool.users;

import ru.sber.javaschool.User;


/*Пользователь является клиентом Банка*/
class SelfClient extends User {

    public SelfClient(String cardnumber, int pinCode) {
        super(cardnumber = "4444555566660000", pinCode = 9999);
    }
}

